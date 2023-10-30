package org.example.week5.Assignment;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import org.example.week5.Assignment.annotation.Email;
import org.example.week5.Assignment.annotation.NotNull;
import org.example.week5.Assignment.annotation.Size;

public class MyValidator {

    private static final String EMAIL_REGEX = "^.+@.+\\..+$";
    public static Set<String> validate(Object obj) throws ClassNotFoundException {
        Class <?> getSuperclass;
        getSuperclass = Class.forName("edu.pnu.cse.");
        Set<String> totalViolation = new HashSet<>();
        Field[] declaredFields = getSuperclass.getDeclaredFields();
        try{
            for (Field field : declaredFields) {
                field.setAccessible(true);
                totalValidation(obj, field, totalViolation);
            }
        }catch (Exception ignored){
        }

        if (obj instanceof GraduateStudent) {
            getSuperclass = Class.forName("org.example.week5.Assignment.GraduateStudent");
            Field[] fields = getSuperclass.getDeclaredFields();
            try {
                for (Field field : fields) {
                    field.setAccessible(true);
                    totalValidation(obj, field, totalViolation);
                }
            } catch (Exception ignored) {
            }
        }

        return totalViolation;
    }

    private static void totalValidation(Object o ,Field f, Set<String >s) throws IllegalAccessException {
        validateNotNullFormat(o,f,s);
        validateEmailFormat(o,f,s);
        validateSizeFormat(o,f,s);
    }



    private static void validateEmailFormat(Object obj,Field field, Set<String> set) throws IllegalAccessException {
        if (field.isAnnotationPresent(Email.class)){
            String email = (String) field.get(obj);
            Email emailAnnotation = field.getAnnotation(Email.class);
            if (!email.matches(EMAIL_REGEX)){
                set.add(emailAnnotation.message());
            }
        }
    }
    private static void validateSizeFormat(Object obj,Field field, Set<String> set) throws IllegalAccessException {
        if (field.isAnnotationPresent(Size.class)){
            String targetString = (String)field.get(obj);
            Size sizeAnnotation = field.getAnnotation(Size.class);
            int min = sizeAnnotation.min();
            int max = sizeAnnotation.max();
            if (targetString != null && (targetString.length() < min || targetString.length() > max)){
                set.add(sizeAnnotation.message());
            }
        }
    }

    private static void validateNotNullFormat(Object obj, Field field, Set<String> set) throws IllegalAccessException {
        if (field.isAnnotationPresent(NotNull.class)){
            String nullableString = (String)field.get(obj);
            NotNull notNullAnnotation = field.getAnnotation(NotNull.class);
            if (nullableString == null){
                set.add(notNullAnnotation.message());
            }
        }
    }


}
