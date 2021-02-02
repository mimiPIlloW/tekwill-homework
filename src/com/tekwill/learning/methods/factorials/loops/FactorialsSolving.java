package com.tekwill.learning.methods.factorials.loops;

public class FactorialsSolving {
    public static void main(String[] args) {
        long factorials = 1;
        for (int i = 1; i <= 20; i++) {
            factorials *= i;
            System.out.println(factorials);
        }
    }
}
