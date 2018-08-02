package com.example.chapter5.importSelector;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Kunzite
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(MyImportSelector.class)
public @interface EnableMyProperties {
}
