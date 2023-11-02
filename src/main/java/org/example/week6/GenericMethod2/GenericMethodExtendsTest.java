package org.example.week6.GenericMethod2;

import java.util.Arrays;
import java.util.List;

public class GenericMethodExtendsTest {
    public static void main(String[] args) {
        List<Integer> intData = Arrays.asList(10, -100);
        List<Double> doubleData = Arrays.asList(-5.1, 10.01);
        List<String> strData = Arrays.asList("ab", "cd");
        NumberRepository data = NumberRepository.getInstance();

        data.addAll(intData);
        data.addAll(doubleData);
        //data.addAll(strData); //compile error
        System.out.println(data);
    }
}
