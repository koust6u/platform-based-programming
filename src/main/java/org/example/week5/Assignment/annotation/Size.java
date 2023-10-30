package org.example.week5.Assignment.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Size {
    int max();
    int min();
    String message();
}
