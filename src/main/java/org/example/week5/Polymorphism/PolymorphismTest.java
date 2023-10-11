package org.example.week5.Polymorphism;


import java.util.List;

public class PolymorphismTest {

    private final static Person[] list;

    static {
        Person p1 = new Person("Brown", 19, "Busan");
        Person p2 = new Person("James", 20, "Masan");

        Student s1= new Student("Ford", 19, "Kimhae", "PNU");
        Student s2 = new Student("Porter", 20, "Ulsan", "PNU");

        Professor pr1 = new Professor("Chae", 52, "Seoul", "PNU", "Computer Science");
        Professor pr2 = new Professor("Kim", 40, "Pusan", "PNU", "Computer Science");

        list = new Person[]{p1, p2, s1, s2, pr1,pr2};
    }

    public static void main(String[] args){
        Person p1 = new Person("Brown", 19, "Busan");
        Person p2 = new Student("Ford", 19, "Kimhae", "PNU");
        Person p3 = new Professor("Chae", 52, "Seoul", "PNU", "Computer Science");
        System.out.println(find(p1));
        System.out.println(find(p2));
        System.out.println(find(p3));
    }


    public static boolean find(Person target){
        for (Person person : list) {
            if (person.equals(target)) return true;
        }
        return false;
    }
}
