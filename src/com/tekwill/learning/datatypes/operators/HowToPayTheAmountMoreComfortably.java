package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class HowToPayTheAmountMoreComfortably {
    public static int SUM_IS_TWENTY = 20;
    public static int SUM_IS_TEN = 10;
    public static int SUM_IS_FIVE = 5;
    public static int SUM_IS_ONE = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();

        int twenty = amount / SUM_IS_TWENTY;
        amount = amount - twenty * 20;
        int ten = amount / SUM_IS_TEN;
        amount = amount - ten * 10;
        int five = amount / SUM_IS_FIVE;
        amount = amount - five * 5;
        int one = amount / SUM_IS_ONE;

        System.out.printf("\n$20 bills: %d\n", twenty);
        System.out.printf("$10 bills: %d\n", ten);
        System.out.printf(" $5 bills: %d\n", five);
        System.out.printf(" $1 bills: %d\n", one);

    }
}
