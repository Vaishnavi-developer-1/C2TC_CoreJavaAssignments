package com;

import java.util.Scanner;

public class Commission {

    String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Address:");
        address = sc.nextLine();

        System.out.println("Enter Phone:");
        phone = sc.nextLine();

        System.out.println("Enter Sales Amount:");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {

        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("Commission: " + commission);
    }
}
