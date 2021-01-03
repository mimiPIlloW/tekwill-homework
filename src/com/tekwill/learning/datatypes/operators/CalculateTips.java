package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate");
        System.out.println("Enter the subtotal:");
        double subtotal = scanner.nextDouble();
        System.out.println("Enter the rate:");
        double rate = scanner.nextDouble();

        double formulaRate = subtotal * rate / 100;
        double formulaTotal = formulaRate + subtotal;

        System.out.printf("The gratuity is %.1f and total is %.1f", formulaRate, formulaTotal);

    }
}
