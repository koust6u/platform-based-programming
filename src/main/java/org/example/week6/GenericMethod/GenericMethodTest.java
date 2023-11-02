package org.example.week6.GenericMethod;

import java.util.List;

public class GenericMethodTest {
    public static void main(String[] args) {

        DataRepository repository = DataRepository.getInstance();

        repository.add(10);

        repository.add("str");

        repository.add(-5.1);

        repository.add(-100);

        repository.add("var");



        List<Integer> intData = repository.getData(Integer.class);

        System.out.println(intData);

        List<String> strData = repository.getData(String.class);

        System.out.println(strData);

    }
}
