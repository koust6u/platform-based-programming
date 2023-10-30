package org.example.week5.MyValidator;


import java.util.Objects;

public class Student {

    private String id;



    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name should be between 3 to 50 characters")
    private String name;



    public Student(String id, String name) {

        this.id = id;

        this.name = name;

    }



    public String getId() {

        return id;

    }



    public String getName() {

        return name;

    }



    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id.equals(student.id);

    }



    @Override

    public int hashCode() {

        return Objects.hash(id);

    }

    @Override
    public String toString() {
        return "Hello world";
    }
}


