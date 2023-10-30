package org.example.week5.MyValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value= ElementType.FIELD)
public @interface Size {
    int min() default 0;
    int max();
    String message();
}
