package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 0 and 1000: ");
        int number = scanner.nextInt();
        int firstNumber = number / 1000;
        int firstModulus = number % 1000;
        int secondNumber = firstModulus / 100;
        int secondModulus = firstModulus % 100;
        int thirdNumber = secondModulus / 10;
        int fourthNumber = secondModulus % 10;
        int result = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println("The sum of the digits is " + result);
    }
}
