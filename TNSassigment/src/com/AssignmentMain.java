package com;

import com.vaishnavi.assignment.employees.Manager;
import com.vaishnavi.assignment.employees.Developer;
import com.vaishnavi.assignment.utilities.Employeeutilities;

public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Gayathri");
        manager.setEmployeeId(101);
        manager.setSalary(70000);
        manager.setTeamSize(5);

        Developer developer = new Developer();
        developer.setName("Vaishu");
        developer.setEmployeeId(102);
        developer.setSalary(50000);
        developer.setProgrammingLanguage("Java");

        Employeeutilities.displayEmployee(manager);
        Employeeutilities.displayEmployee(developer);
    }
}
