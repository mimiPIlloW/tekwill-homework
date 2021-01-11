package com.tekwill.learning.loops;

public class CalculatingTheProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product = product * i;
            }
        }
        System.out.println("Product is " + product);
    }
}
