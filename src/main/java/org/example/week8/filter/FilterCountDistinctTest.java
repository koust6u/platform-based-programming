package org.example.week8.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterCountDistinctTest {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            data.add(sc.nextInt());

        }

        sc.close();

        System.out.println(data.stream().filter(e -> e < 10).collect(Collectors.toList()));
        System.out.println(data.stream().filter(e -> e< 10).count());
        System.out.println(data.stream().filter(e -> e < 10).distinct().collect(Collectors.toList()));
        System.out.println(data.stream().filter(e -> e >= 10).collect(Collectors.toList()));
        System.out.println(data.stream().filter(e -> e >= 10).count());
        System.out.println(data.stream().filter(e -> e >= 10).distinct().collect(Collectors.toList()));

    }
}
