package org.example.week4.Assignment;


public class MyObjectMapperTest {

    public static void main(String[] args) throws Exception {

        String personJsonString = "{\"name\": \"J\\u00F4hn D\\u00F6\\u10100e\", \"age\": 30}";

        System.out.println(personJsonString);

        MyObjectMapper mapper = new MyObjectMapper();

        Person person = mapper.readValue(personJsonString, Person.class);



        System.out.println("Parsed Person object:");

        System.out.println("Name: " + person.getName());

        System.out.println("Age: " + person.getAge());



        String studentJsonString = "{\"studentName\": \"Alice\", \"studentId\": 123, \"gpa\": 3.5}";

        Student student = mapper.readValue(studentJsonString, Student.class);



        System.out.println("Parsed Student object:");

        System.out.println("Student Name: " + student.getStudentName());

        System.out.println("Student ID: " + student.getStudentId());

        System.out.println("GPA: " + student.getGpa());

    }

}
