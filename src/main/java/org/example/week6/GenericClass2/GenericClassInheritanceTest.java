package org.example.week6.GenericClass2;

import java.util.Scanner;

public class GenericClassInheritanceTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GenericClassInheritanceTest genericClassTest =

                new GenericClassInheritanceTest();

        genericClassTest.printData(new IntTypeData(sc.nextInt()), sc.nextInt());

        genericClassTest.printData(new FloatTypeData(sc.nextFloat()), sc.nextFloat());

        sc.close();

    }



    public <T> void printData(SpecificTypeData<T> typeData, T addValue) {

        typeData.addData(addValue);

        T data = typeData.getData();

        System.out.println(data);

    }
}
