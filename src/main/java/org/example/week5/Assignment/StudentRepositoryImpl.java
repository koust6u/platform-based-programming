package org.example.week5.Assignment;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository{
    private final Map<String, Student> students = new HashMap<>();

    @Override
    public Student save(Student student) {
        return students.put(student.getId(), student);
    }

}
