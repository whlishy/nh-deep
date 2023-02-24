package com.github.jeffreyning.da.anno;

import java.lang.annotation.*;

/**
 * tag名称标识
 * @author ninghao
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TagName {
    String value() default "";
}
