package org.example.week6.GenericClass;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList <T>{
    private List<T> myArrayList;
    public MyArrayList(int capacity) {

        myArrayList = new ArrayList<>(capacity);
    }



    public void add(T data) {
        myArrayList.add(data);
    }



    public T get(int index) {

        return myArrayList.get(index);
    }
}
