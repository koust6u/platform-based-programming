package org.example.week5.MyValidator;


import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class MyValidator {

    public static Set<String> validate(Object obj) {

        Set<String> violations = new HashSet<>();
        try {
            Class<?> clazz = Class.forName("org.example.week5.MyValidator.Student");

            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                Annotation[] annotations = declaredField.getAnnotations();;
                checkValidation(obj, declaredField);
            }
        } catch (ClassNotFoundException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return violations;

    }


    private static void checkValidation(Object obj,Field field)
            throws IllegalAccessException {

        if (field.isAnnotationPresent(NotNull.class)) {
            NotNull notNull = field.getAnnotation(NotNull.class);
            String fieldString = (String) field.get(obj);
            if (fieldString == null) {
                System.out.println("Validation errors: [" + notNull.message() + "]");
            }
        }
        if (field.isAnnotationPresent(Size.class)){
            String fieldString = (String)field.get(obj);
            Size size = field.getAnnotation(Size.class);
            int min = size.min();
            int max = size.max();
            if (fieldString != null &&(fieldString.length() > max || fieldString.length() < min)){
                System.out.println("Validation errors: ["+size.message()+ "]");
                System.out.println("Aa");
            }
        }
     }
}



