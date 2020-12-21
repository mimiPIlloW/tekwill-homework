package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class PopulationInThePercent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Population in the world:");
        long populationWorld = scanner.nextLong();
        System.out.println("Population in the USA");
        long populationUSA = scanner.nextLong();
        System.out.println("Population in the France");
        long populationFrance = scanner.nextLong();
        System.out.println("Population in the Germany");
        long populationGermany = scanner.nextInt();

        System.out.println("Population in the USA" + (populationUSA * 100) / populationWorld + "%");
        System.out.println("Population in the France" + (populationFrance * 100) / populationWorld + "%");
        System.out.println("Population in the German" + (populationGermany * 100) / populationWorld + "%");
    }
}
