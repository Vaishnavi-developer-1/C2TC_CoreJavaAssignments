package com;

import java.util.Scanner;

public class Circle {

    double radius;
    String colour;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        radius = sc.nextDouble();

        System.out.println("Enter Colour:");
        colour = sc.next();
    }

    void calcArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {

        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
