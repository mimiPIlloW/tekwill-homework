package com.tekwill.learning.io;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many species of animals in the world?");
        long AnimalPopulation = scanner.nextLong();
        System.out.println("Current animal population is " + AnimalPopulation);

        System.out.println("WWhat are the growth rates of animals in the world");
        long rateOfGrowing = scanner.nextLong();
        System.out.println("Growth rate of animals in percentages is " + rateOfGrowing + "% in year.");

        System.out.println("What source do you use");
        scanner.nextLine();
        String source1 = scanner.nextLine();
        System.out.println("And the second source?");
        String source2 = scanner.nextLine();
        System.out.println("Sources for animal counting:\n" + source1 + "\n*" + source2);

    }

}

