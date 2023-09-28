package org.example.week4.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {

    //Singleton pattern
    private static EmployeeRepository instance =  new EmployeeRepository();

    private  Map<String, Employee> employees = new HashMap<>();

    private EmployeeRepository() {
    }


    public static EmployeeRepository getInstance(){
        return instance;
    }


    public void add(Employee employee){
        employees.put(employee.getName(),employee);
    }

    public boolean contains(Employee employee){
        return employees.containsKey(employee.getName());
    }

    public Employee get(Employee employee){
        return employees.get(employee.getName());
    }

}
