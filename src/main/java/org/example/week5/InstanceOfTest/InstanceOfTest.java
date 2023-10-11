package org.example.week5.InstanceOfTest;

public class InstanceOfTest {

    public static void main(String[] args) {

        Person p1 = new Person("Brown", 19, "Busan");
        Person p2 = new Person("James", 20, "Masan");
        Student s1 = new Student("Ford", 19, "Kimhae", "PNU");
        Student s2 = new Student("Porter", 20, "Ulsan", "PNU");
        Professor pr1 =  new Professor("Chae", 52, "Seoul", " PNU", "Computer Science");
        Professor pr2 = new Professor("Kim", 40, "Pusan", "PNU", "Computer Science");

        Person[] list = {p1,p2,s1, s2,pr1, pr2};

        for (Person person : list) {
            System.out.printf("%s, %d, %s%n", person.getName(), person.getAge(), person.getAddress());
            if (person instanceof Student){
                Student s = (Student) person;
                System.out.printf("School: %s, %s%n", s.getSchoolName(), s.getGrade());
            }else if (person instanceof Professor){
                Professor pr = (Professor) person;
                System.out.printf(" School: %s, %s%n", pr.schoolName(), pr.major());
            }
        }
    }
}
