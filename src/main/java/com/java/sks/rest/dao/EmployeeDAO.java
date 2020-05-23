package com.java.sks.rest.dao;

import com.java.sks.rest.model.Employee;
import com.java.sks.rest.model.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Sandeep", "Singh", "sandeep@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Ankur", "Mall", "ankur@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Ankit", "Singh", "ankit@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
