package com.github.jeffreyning.da.anno;

import java.lang.annotation.*;

/**
 * 属性名称标识
 * @author ninghao
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AttrName {
    String value() default "";
}
