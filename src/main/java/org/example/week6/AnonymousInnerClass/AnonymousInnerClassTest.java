package org.example.week6.AnonymousInnerClass;

import java.util.Scanner;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        double addValue = sc.nextDouble();

        sc.close();



        SpecificTypeData<Double> doubleType = new SpecificTypeData<Double>(value) {
            @Override
            public void addData(Double data) {
                this.data += data;
            }
        };

        doubleType.addData(addValue);



        System.out.println(doubleType.getData());

    }
}
