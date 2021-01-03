package com.tekwill.learning.loops;

import java.util.Scanner;

public class DefinitionsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int totalNegativ = 0;
        int totalPositiv = 0;
        int totalZero = 0;

        System.out.println("Enter first number");
        number1 = scanner.nextInt();
        System.out.println("Enter second number");
        number2 = scanner.nextInt();
        System.out.println("Enter third number");
        number3 = scanner.nextInt();
        System.out.println("Enter fourth number");
        number4 = scanner.nextInt();
        System.out.println("Enter fifth number");
        number5 = scanner.nextInt();

        if (number1 < 0) {
            totalNegativ++;
        }
        if (number2 < 0) {
            totalNegativ++;
        }
        if (number3 < 0) {
            totalNegativ++;
        }
        if (number4 < 0) {
            totalNegativ++;
        }
        if (number5 < 0) {
            totalNegativ++;
        }
        ///////////////////////////////////////////////////////
        if (number1 > 0) {
            totalPositiv++;
        }
        if (number2 > 0) {
            totalPositiv++;
        }
        if (number3 > 0) {
            totalPositiv++;
        }
        if (number4 > 0) {
            totalPositiv++;
        }
        if (number5 > 0) {
            totalPositiv++;
        }
        //////////////////////////////////////////
        if (number1 == 0) {
            totalZero++;
        }
        if (number2 == 0) {
            totalZero++;
        }
        if (number3 == 0) {
            totalZero++;
        }
        if (number4 == 0) {
            totalZero++;
        }
        if (number5 == 0) {
            totalZero++;
        }

        System.out.println("");
        System.out.println("total negativ is:" + totalNegativ);
        System.out.println("total positiv is:" + totalPositiv);
        System.out.println("total zero is:" + totalZero);
    }
}
