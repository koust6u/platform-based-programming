package org.example.week4.Assignment;

import java.lang.reflect.Field;
import java.util.HashMap;

public class MyObjectMapper {

    private MyJsonParser parser;



    public MyObjectMapper() {
        this.parser = new MyJsonParser();
    }



    public <T> T readValue(String jsonString, Class<T> clazz) throws Exception {
        HashMap<String, Object> map = parser.parse(jsonString);
        T t = clazz.getDeclaredConstructor().newInstance();

        for (Field field: clazz.getDeclaredFields()){
            field.setAccessible(true);
            if (map.containsKey(field.getName())){
                String value = (String)map.get(field.getName());
                Object o = convertPrimitiveType(value, field.getType());
                field.set(t, o);
            }
        }
        return t;
    }

    private Object convertPrimitiveType(String value, Class<?> fieldType) throws NoSuchFieldException {
        if (fieldType == String.class) return value;
        if (fieldType == int.class) return Integer.parseInt(value);
        if (fieldType == double.class) return Double.parseDouble(value);

        throw new NoSuchFieldException();
    }
}