package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConverterLatitudeDecimal {
    public static final double SECONDS_OF_ARC_TO_A_MINUTE = 60.0;
    public static final double MINUTES_OF_ARC_TO_A_DEGREE = 60.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a latitude in degrees,minutes, and seconds:");
        System.out.println("First, enter the degrees:");
        int degrees = scanner.nextInt();
        System.out.println("Next, enter the minutes:");
        int minutes = scanner.nextInt();
        System.out.println("First, enter the second:");
        int second = scanner.nextInt();

        double result = degrees + (minutes / SECONDS_OF_ARC_TO_A_MINUTE) + (second / (SECONDS_OF_ARC_TO_A_MINUTE * MINUTES_OF_ARC_TO_A_DEGREE));
        System.out.printf("%.4f", result);

    }

}
