package org.example.week7.CircleTest;

public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 10);

        Circle c2 = new Circle(10, 10, 10);

        Circle c3 = new Circle(0, 0, 10);



        MyComparable[] list = {c1, c2, c3};



        for (int i = 0; i < list.length; i++) {

            if (list[0].compareTo(list[i]) < 0) System.out.println(list[0] + " has smaller size than " + list[i]);

            else if (list[0].compareTo(list[i]) == 0) System.out.println(list[0] + " has the same size as " + list[i]);

            else if (list[0].compareTo(list[i]) > 0) System.out.println(list[0] + " has the larger size than " + list[i]);

        } // actually, Circle is a subclass of Object. So, toString() can be invoked.



        Rectangle r1 = new Rectangle(3, 4);

        Rectangle r2 = new Rectangle(5, 2);

        Rectangle r3 = new Rectangle(2, 8);



        MyComparable[] list2 = {r1, r2, r3};



        for (int i = 0; i < list2.length; i++) {

            if (list2[0].compareTo(list2[i]) < 0) System.out.println(list2[0] + " has smaller size than " + list2[i]);

            else if (list2[0].compareTo(list2[i]) == 0) System.out.println(list2[0] + " has the same size as " + list2[i]);

            else if (list2[0].compareTo(list2[i]) > 0) System.out.println(list2[0] + " has the larger size than " + list2[i]);

        }
    }
}
