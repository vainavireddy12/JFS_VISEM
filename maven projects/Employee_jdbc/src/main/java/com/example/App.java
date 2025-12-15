package com.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            EmployeeDAO dao = new EmployeeDAO();

            Employee e1 = new Employee("John Doe", "john@example.com", 50000);
            dao.addEmployee(e1);
            System.out.println("Employee Added Successfully!");

            List<Employee> employees = dao.getAllEmployees();
            for (Employee e : employees) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
