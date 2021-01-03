package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ConversionCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        double celsius = scanner.nextInt();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.printf("%.0f Celsius is %.1f Fahrenheit ", celsius, fahrenheit);
    }
}
