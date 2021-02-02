package com.tekwill.learning.methods.displaypatterns;

import java.util.Scanner;

public class DisplayPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        DisplayPatternsDemo.displayPatternDemoIs(numberOfRows);
    }
}
