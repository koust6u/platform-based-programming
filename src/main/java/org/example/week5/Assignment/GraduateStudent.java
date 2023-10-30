package org.example.week5.Assignment;

import org.example.week5.Assignment.annotation.NotNull;
import org.example.week5.Assignment.annotation.Size;

public class GraduateStudent extends Student{
    @NotNull(message = "Thesis title cannot be null")
    @Size(min = 5, max = 200, message = "Thesis title should be between 5 to 200 characters")
    private String thesisTitle;



    public GraduateStudent(String id, String name, String email, String thesisTitle) {
        super(id, name, email);
        this.thesisTitle = thesisTitle;

    }

    // implement your code

    @Override
    public String toString(){
        return String.format("GraduateStudent { Student{id='%s', name='%s', email='%s'}, thesisTitle='%s'}"
        ,this.getId(), this.getName(), this.getEmail(), this.thesisTitle);
    }
}
