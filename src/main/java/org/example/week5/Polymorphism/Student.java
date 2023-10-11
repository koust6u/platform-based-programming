package org.example.week5.Polymorphism;

import java.util.Objects;

public class Student extends Person {
    private String schoolName;

    private Grade grade = Grade.FRESH;

    public Student(String name, int age, String address, String schoolName) {
        super(name, age, address);
        this.schoolName = schoolName;
    }

    public String getSchoolName(){ return schoolName;}
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public Grade getGrade(){ return grade;}

    public void upGrade(){ grade.upGrade();}

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(),schoolName, grade.getGrade());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(schoolName, student.schoolName) && grade == student.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolName, grade);
    }
}
