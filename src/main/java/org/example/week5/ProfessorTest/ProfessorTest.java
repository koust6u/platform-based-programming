package org.example.week5.ProfessorTest;

public class ProfessorTest {

    public static void main(String[] args) {
        Student s1 = new Student("Ford", 19, "Kimhae", "PNU");
        System.out.println(s1);
        s1.setSchoolName("한국대학교");
        s1.upGrade();
        System.out.println(s1);

        Student s2 = new Student("Porter", 20, "Ulsan", "PNU");
        System.out.println(s2);
        s2.rename("Harrison");
        s2.increaseAge();
        System.out.println(s2);

        Professor p1 = new Professor("Tom", 40, "Seoul", "PNU", "Computer Science");
        System.out.println(p1);
        p1.rename("Thomson");
        p1.increaseAge();
        p1.setMajor("Information Science");
        System.out.println(p1);

    }
}
