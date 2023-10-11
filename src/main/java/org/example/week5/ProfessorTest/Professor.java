package org.example.week5.ProfessorTest;

public class Professor extends Person{

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
}
