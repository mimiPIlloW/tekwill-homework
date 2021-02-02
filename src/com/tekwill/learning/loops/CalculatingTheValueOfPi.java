package com.tekwill.learning.loops;

import java.util.Scanner;

public class CalculatingTheValueOfPi {
    public static void main(String[] args) {

        System.out.println("Enter a number in range of 0 to 200.000: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int odd = 1;
        double pi = 0.0;
        double currentTerm = 0.0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                currentTerm = (double) -4 / odd;
            } else {
                currentTerm = (double) 4 / odd;
            }
            odd = odd + 2;
            pi = pi + currentTerm;
        }
        System.out.printf("%.3f", pi);

    }

}







