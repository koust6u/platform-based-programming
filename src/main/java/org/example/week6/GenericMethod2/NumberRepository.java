package org.example.week6.GenericMethod2;


import java.util.ArrayList;
import java.util.List;

public class NumberRepository {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    //implement addAll() method

    public <T extends Number> void addAll(List<T> list) {
        for (T t : list) {
            data.add(t);
        }
    }
    public String toString(){
        return data.toString();
    }
}