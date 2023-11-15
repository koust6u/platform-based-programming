package org.example.week8.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> data = new ArrayList<>();

        data.add(sc.next());

        data.add(sc.next());

        data.add(sc.next());

        data.add(sc.next());

        data.add(sc.next());

        sc.close();



        List<String> upperStrData = data.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        System.out.println(upperStrData);

    }
}
