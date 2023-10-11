package org.example.week5.ProfessorTest;

public class Grade {

    private static final int FRESH = 1;
    private static final int SOPHOMORE = 2;
    private static final int JUNIOR = 3;
    private static final int SENIOR = 4;

    private int grade;
    public Grade(){ this.grade = FRESH;}
    public Grade(int grade){ this.grade = grade;}


    public int getGrade(){ return grade;}

    public void upGrade(){ if (grade != SENIOR) grade++;}


    @Override
    public String toString() {
        return String.valueOf(grade);
    }
}
