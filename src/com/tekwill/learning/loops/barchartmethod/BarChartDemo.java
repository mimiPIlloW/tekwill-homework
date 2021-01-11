package com.tekwill.learning.loops.barchartmethod;

import java.util.Scanner;

import static com.tekwill.learning.loops.barchartmethod.BarChart.display;

public class BarChartDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer first (1-30): ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter an integer second (1-30): ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter an integer third (1-30): ");
        int numberThree = scanner.nextInt();
        System.out.println("Enter an integer fourth (1-30): ");
        int numberFour = scanner.nextInt();
        System.out.println("Enter an integer fifth (1-30): ");
        int numberFive = scanner.nextInt();

        display(numberOne);
        display(numberTwo);
        display(numberThree);
        display(numberFour);
        display(numberFive);
    }
}
