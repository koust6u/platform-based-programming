package org.example.week7.CircleTest;

public class CircleSortTest {

    public static void main(String[] args) {

        Circle c1 = new Circle(0, 0, 15);

        Circle c2 = new Circle(10, 10, 10);

        Circle c3 = new Circle(0, 0, 20);



        MyComparable[] list = {c1, c2, c3};

        //MySort.sort(list);



        for (Object o : list) // for (Circle o : list) is allowed?

            System.out.println(o);



        Rectangle r1 = new Rectangle(3, 4);

        Rectangle r2 = new Rectangle(5, 2);

        Rectangle r3 = new Rectangle(2, 8);



        MyComparable[] list2 = {r1, r2, r3};

        MyRectangleSort.sort(list2);



        for (Object o : list2) // for (Circle o : list) is allowed?

            System.out.println(o);

    }
}
