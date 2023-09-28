package org.example.week4.EmployeeTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ObjectMethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee(sc.next(), sc.nextDouble());
        Employee e2 = new Employee(sc.next(), sc.nextDouble());
        sc.close();

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.toString().equals(e2.toString()));

        System.out.println(e1.hashCode() != e2.hashCode());
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees.contains(e1));

        HashMap<Employee, Employee> pair = new HashMap<Employee, Employee>();
        pair.put(e1, e2);
        Employee found = pair.get(e1);
        System.out.println(found);
    }
}
