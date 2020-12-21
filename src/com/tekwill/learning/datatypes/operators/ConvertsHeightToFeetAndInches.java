package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConvertsHeightToFeetAndInches {
    public static final int Height_In_Integer_Inches = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in inches:");
        double heightInInches = scanner.nextDouble();
        double feetСalculation = heightInInches / Height_In_Integer_Inches;
        double inches = heightInInches % Height_In_Integer_Inches;

        System.out.println("Feet is: " + feetСalculation + "\n" + "Inches is: " + inches);

    }
}
