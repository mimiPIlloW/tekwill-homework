package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {
//    public static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;
        System.out.println("Enter radius and length");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.printf("The area is %.4f", area);
        System.out.printf("The volume is %.1f", volume);


    }
}
