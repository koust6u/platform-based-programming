package org.example.week6.GenericClass;

import java.util.Scanner;

public class GenericClassTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyArrayList<String> strList = new MyArrayList<>(10);

        strList.add(sc.next());

        strList.add(sc.next());

        System.out.println(strList.get(0));

        System.out.println(strList.get(1));

        MyArrayList<Integer> intList = new MyArrayList<>(10);

        intList.add(sc.nextInt());

        intList.add(sc.nextInt());

        System.out.println(intList.get(1));

        System.out.println(intList.get(0));

        sc.close();

    }
}
