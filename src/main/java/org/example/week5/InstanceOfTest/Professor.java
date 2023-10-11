package org.example.week5.InstanceOfTest;

public class Professor extends Person{

    private String SchoolName;
    private String major;

    public Professor(String name, int age, String address, String schoolName, String major) {
        super(name, age, address);
        SchoolName = schoolName;
        this.major = major;
    }

    public String schoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String major() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
