package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class AmountDollarsAndCentsWithPercent {
    public static double TAX_ADDED = 0.05;
//    public static double TAX_ADDED = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dollars and cents:");
        double amountDollarsAndCents = scanner.nextDouble();
//        double formula = amountDollarsAndCents * TAX_ADDED / 100;
//        System.out.printf("The percentage with the amount dollars and cents: $%.2f\n", formula + amountDollarsAndCents);
//        ||
        System.out.printf("The percentage with the amount dollars and cents: $%.2f\n" +
                "", amountDollarsAndCents + amountDollarsAndCents * TAX_ADDED);

    }
}
