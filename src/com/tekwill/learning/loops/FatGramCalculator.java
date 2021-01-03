package com.tekwill.learning.loops;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of calories");
        double totalCal = scanner.nextDouble();
        System.out.println("Enter the amount of fat in grams");
        double totalFat = scanner.nextDouble();

        double fatCal = totalFat * 9;
        double fatPercent = (fatCal / totalCal) * 100;

        if (fatCal > totalCal) {
            System.out.println("Invalid Input");
        } else if (fatPercent < 30) {
            System.out.println("Total Calories: " + totalCal + "\nTotal Fat: " +
                    totalFat + "g" + "\nFat Percentage: " + fatPercent + "%" + "\nSynopsis: Low in Fat");
        } else {
            System.out.println("Total Calories: " + totalCal + "\nTotal Fat: " +
                    totalFat + "g" + "\nFat Percentage: " + fatPercent + "%");
        }
    }
}