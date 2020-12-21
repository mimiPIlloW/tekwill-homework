package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConverterBMI {
    public static final int INCHES_IN_FOOT = 12;
    public static final double INCHES_IN_METER = 0.0254;
    public static final double POUNDS_IN_KILO = 2.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your feet:");
        int feet = scanner.nextInt();
        System.out.println("Enter your inches:");
        int inches = scanner.nextInt();
        System.out.println("Enter your weight in pounds:");
        int weightInPounds = scanner.nextInt();
        int heightInInches = feet * INCHES_IN_FOOT + inches;
        double heightInMeters = heightInInches * INCHES_IN_METER;
        double weightInKilo = weightInPounds / POUNDS_IN_KILO;
        double bodyMassIndex = weightInKilo / (heightInMeters * heightInMeters);
        System.out.printf("BMI is %.4f", bodyMassIndex);
    }
}
