package com.tekwill.learning.methods.barchart.loops;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer first (1-30): ");
        int num1 = scanner.nextInt();
        System.out.println("Enter an integer second (1-30): ");
        int num2 = scanner.nextInt();
        System.out.println("Enter an integer third (1-30): ");
        int num3 = scanner.nextInt();
        System.out.println("Enter an integer fourth (1-30): ");
        int num4 = scanner.nextInt();
        System.out.println("Enter an integer fifth (1-30): ");
        int num5 = scanner.nextInt();

        for (int j = 1; j <= num1; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= num2; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= num3; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= num4; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= num5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
