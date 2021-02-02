package com.tekwill.learning.methods.factorials;

public class Fctorials {
    public static void factorial(int number) {

        long factorialNumber = 1;
        System.out.print("i      factorial");
        for (int i = 1; i <= number; i++) {
            factorialNumber *= i;
            System.out.printf("\n%d       %d", i, factorialNumber);
        }
    }
}
