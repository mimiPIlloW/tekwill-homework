package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ComputesTheVolumeOfASphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = scanner.nextInt();

        double result = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);

        System.out.println("Value is: " + result);


    }
}
