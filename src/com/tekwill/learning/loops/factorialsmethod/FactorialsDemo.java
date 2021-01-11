package com.tekwill.learning.loops.factorialsmethod;

import java.util.Scanner;

import static com.tekwill.learning.loops.factorialsmethod.Fctorials.factorial;

public class FactorialsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate his factorial :");
        factorial(scanner.nextInt());
    }
}
