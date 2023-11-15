package org.example.week7.StudentSortTest;

public class Person implements MyMovable {
    private String transportation;

    public Person(String transportation) {
        this.transportation = transportation;
    }


    @Override
    public String moveBy() {
        return String.format("나는 %s로 출근한다.", transportation);
    }
}
