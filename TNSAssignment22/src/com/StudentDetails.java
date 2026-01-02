package com;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full Name with Initial:");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter Grade:");
        char grade = sc.next().charAt(0);

        System.out.println("Enter Percentage:");
        String percentage = sc.next();

        System.out.println("\n--- Student Details ---");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(grade);
        System.out.println(percentage);

        sc.close();
    }
}
