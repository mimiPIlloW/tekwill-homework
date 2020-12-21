package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class CarFuelGallonLitersPe100Km {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distance in litres? ");
        double liters = scanner.nextInt();
        System.out.println("Petrol in kilometers? ");
        double kilometers = scanner.nextInt();
        double result = (liters / kilometers) * 100.0;
        System.out.println(result);
    }
}
