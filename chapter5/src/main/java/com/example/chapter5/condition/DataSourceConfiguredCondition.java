package com.example.chapter5.condition;

import com.example.chapter5.condition.properties.DataSourceProperty;
import org.springframework.boot.autoconfigure.condition.ConditionMessage;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.MethodMetadata;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author: Marcher丶
 * @Date: 2022-07-13 16:25
 **/
public class DataSourceConfiguredCondition extends SpringBootCondition {

    private static final Bindable<Map<String, DataSourceProperty>> STRING_REGISTRATION_MAP = Bindable.mapOf(String.class, DataSourceProperty.class);

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConditionMessage.Builder message = ConditionMessage.forCondition("DataSource Configured Condition");
        Map<String, DataSourceProperty> registrations = getRegistrations(context.getEnvironment());
//        metadata = (AnnotationMetadata) metadata;
        String dbType = ((MethodMetadata) metadata).getMethodName();
        if (!registrations.isEmpty()) {
            if (!registrations.containsKey(dbType)) {
                throw new IllegalStateException("DataSource registered error not exist db name " + dbType);
            }
            return ConditionOutcome.match(message.foundExactly("DataSource Configured Condition " + registrations.values().stream().map(DataSourceProperty::getDriverClassName).collect(Collectors.joining(", "))));
        }
        return ConditionOutcome.noMatch(message.notAvailable("DataSource Configured Condition"));
    }

    private Map<String, DataSourceProperty> getRegistrations(Environment environment) {
        return Binder.get(environment).bind("spring.wyb.datasource", STRING_REGISTRATION_MAP).orElse(Collections.emptyMap());
    }
}

