package org.example.week7.StudentSortTest;

public class Student implements MyComparable{

    private int studentID;
    private String name;
    private float gpa;

    public Student(int studentID, String name, float gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object other) {
        Student otherStudent = (Student) other;
        int returnValue = 0;
        if (gpa < otherStudent.gpa) returnValue = -1;
        if (gpa == otherStudent.gpa) returnValue = 0;
        if (gpa > otherStudent.gpa) returnValue = 1;
        return returnValue;
    }

    @Override
    public boolean equal(Object other) {
        return studentID == ((Student)other).studentID;
    }

    @Override
    public String toString() {
        return String.format("ID: %5d, Name: %15s, GPA: %5.2f", studentID, name, gpa);
    }
}
