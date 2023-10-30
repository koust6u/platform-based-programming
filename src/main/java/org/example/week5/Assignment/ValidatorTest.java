package org.example.week5.Assignment;

import java.lang.reflect.Proxy;

public class ValidatorTest {

    public static void main(String[] args) {

        StudentRepository proxyRepository = createStudentRepositoryProxy();

        Student student1 = new Student("S001", "Jo", "jo.email");
        proxyRepository.save(student1);

        Student student2 = new Student("S003", "John", "john@email.com");
        proxyRepository.save(student2);

        GraduateStudent gradStudent1 = new GraduateStudent("GS001", "Josh", "jo@invalid", "Why do programmers prefer dark mode?");
        proxyRepository.save(gradStudent1);

        GraduateStudent gradStudent2 = new GraduateStudent("GS002", "John", "john@example.com", null);
        proxyRepository.save(gradStudent2);

        GraduateStudent gradStudent3 = new GraduateStudent("GS003", "Jane", "jane@example.com", "Deciphering the language of cats using quantum physics");
        proxyRepository.save(gradStudent3);

    }



    private static StudentRepository createStudentRepositoryProxy() {

        StudentRepository studentRepository = new StudentRepositoryImpl();

        StudentRepository proxyRepository = (StudentRepository) Proxy.newProxyInstance(
                StudentRepository.class.getClassLoader(),
                new Class[] { StudentRepository.class },
                new ValidationInvocationHandler(studentRepository)
        );

        return proxyRepository;

    }

}

