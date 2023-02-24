package com.github.jeffreyning.da.anno;

import java.lang.annotation.*;

/**
 * 类名称标识
 * @author ninghao
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface NodeName {
    String value() default "";
}
