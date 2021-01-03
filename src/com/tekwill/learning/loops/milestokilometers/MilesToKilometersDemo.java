package com.tekwill.learning.loops.milestokilometers;

public class MilesToKilometersDemo {
    public static void main(String[] args) {
        double kilometers = 1.609;
        for (int milesIs = 1; milesIs <= 10; milesIs++) {
            System.out.printf("%-8d %.3f\n", milesIs, (milesIs * kilometers));
        }
    }
}
