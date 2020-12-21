package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ProgramConsumptionFigureGasoline {

    public static double MILES_PER_100_KM = 62.14;
    public static double LITERS_PER_GALLON = 3.875;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter automobile gasoline consumption in liters per 100 kilometers: ");
        double gasLine = scanner.nextDouble();
//        double mpg = 1/(gasLine/LITERS_PER_GALLON) * MILES_PER_100_KM;
//        System.out.println(mpg);
//        can do this
        System.out.println("The automobile gasoline consumption is:\n" + MILES_PER_100_KM / (gasLine / LITERS_PER_GALLON));
    }
}
