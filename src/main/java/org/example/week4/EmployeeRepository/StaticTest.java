package org.example.week4.EmployeeRepository;

import java.util.Scanner;

public class StaticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee(sc.next(),sc.nextDouble());
        Employee employee2 = new Employee(sc.next(),sc.nextDouble());
        Employee employee3 = new Employee(sc.next(),sc.nextDouble());
        sc.close();

        EmployeeRepository repository = EmployeeRepository.getInstance();

        repository.add(employee1);
        repository.add(employee2);

        System.out.println(findEmployee(employee1));
        System.out.println(findEmployee(employee3));
    }

    private static Employee findEmployee(Employee employee){
        EmployeeRepository repository = EmployeeRepository.getInstance();
        if (repository.contains(employee)){
            return repository.get(employee);
        }
        else return new Employee("DEFAULT", 0.0);
    }
}
