package org.example.week5.Assignment;

import org.example.week5.Assignment.annotation.Valid;

public interface StudentRepository {
    public Student save(@Valid Student student);
}
