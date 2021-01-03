package com.tekwill.learning.loops.milestokilometers;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {

        double kilometers = 1.609;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter miles 1 to 10");
        int miles = scanner.nextInt();
        System.out.println("Miles    Kilometers ");
        if (miles >= 1 && miles <= 10) {
            System.out.printf("%-8d %.3f", miles, (miles * kilometers));
        }
    }
}


