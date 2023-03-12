package org.example.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CommandKeyword {
    /**
     * To be no name needed to annotation, must name value and no another element
     * @return
     */
    String value();

    /**
     * Default method
     * @return
     */
    String method() default "calculate";
}
