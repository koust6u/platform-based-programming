package org.example.week7.StudentSortTest;

public class StudentSortTest {
    public static void main(String[] args) {
        System.out.println("=================================================");





        Person p1 = new Person("bus");

        Person p2 = new Person("subway");



        MyMovable[] list2 = {p1, p2};

        for (MyMovable movable : list2) {

            System.out.println(movable.moveBy());

        }



        System.out.println("=================================================");



    }
}
