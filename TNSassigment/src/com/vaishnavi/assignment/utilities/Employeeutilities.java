package com.vaishnavi.assignment.utilities;

import com.vaishnavi.assignment.employees.Employee;

/**
 * Utility class for employee operations.
 */
public class Employeeutilities {

    public static void displayEmployee(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }
}
