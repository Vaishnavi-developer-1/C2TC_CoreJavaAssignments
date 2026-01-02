package com;

public class CommissionMain {

    public static void main(String[] args) {

        Student s = new Student();   // constructor message prints

        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}
