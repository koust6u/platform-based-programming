package org.example.week8.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> data = new ArrayList<>();

        data.add(sc.nextInt());

        data.add(sc.nextInt());

        data.add(sc.nextInt());

        data.add(sc.nextInt());

        data.add(sc.nextInt());

        sc.close();

        data.stream().forEach(System.out::println);

        data.stream().forEach(e -> System.out.println(e +1000));

    }
}
