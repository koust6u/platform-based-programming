package org.example.week8.pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PipelineTest {
    public static void main(String[] args) {

        List<Object> data = new ArrayList<>();

        data.add(10);

        data.add("str");

        data.add(-5.1);

        data.add(-100);

        data.add("var");



        List<String> strData = data.stream().distinct()
                        .filter(e -> e instanceof String)
                                .map(e -> (String)e)
                                        .collect(Collectors.toList());

        System.out.println(strData);

    }
}
