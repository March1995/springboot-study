package com.example.chapter2.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 *
 * 继承了WebMvcConfigurerAdapter这个类，
 * 这个类是SpringBoot内部提供专门处理用户自行添加的配置，
 * 里面不仅仅包含了修改视图的过滤还有其他很多的方法，包括我们后面章节要讲到的拦截器，过滤器，Cors配置等。
 */
@Configuration
public class FastJsonConfiguration extends WebMvcConfigurerAdapter {
    /**
     * 修改自定义消息转换器
     * @param converters 消息转换器列表
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //调用父类的配置
        super.configureMessageConverters(converters);
        //创建fastJson消息转换器
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //创建配置类
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //修改配置返回内容的过滤
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty
        );
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //将fastjson添加到视图消息转换器列表内
        converters.add(fastConverter);
    }


    /**
     *
     * FastJson SerializerFeatures
     WriteNullListAsEmpty  ：List字段如果为null,输出为[],而非null
     WriteNullStringAsEmpty ： 字符类型字段如果为null,输出为"",而非null
     DisableCircularReferenceDetect ：消除对同一对象循环引用的问题，默认为false（如果不配置有可能会进入死循环）
     WriteNullBooleanAsFalse：Boolean字段如果为null,输出为false,而非null
     WriteMapNullValue：是否输出值为null的字段,默认为false。

     作者：恒宇少年
     链接：http://www.jianshu.com/p/14df78573cb2
     來源：简书
     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
