package org.example.week5.Polymorphism;

import java.util.Objects;

public class Professor extends Person {

    private String major;

    private String schoolName;

    public Professor(String name, int age, String address, String schoolName, String major) {
        super(name, age, address);
        this.major = major;
        this.schoolName = schoolName;
    }

    public void setMajor(String major){
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %s, %s",
                getName(), getAge(), getAddress(),schoolName, major);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(major, professor.major) && Objects.equals(schoolName, professor.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), major, schoolName);
    }
}
