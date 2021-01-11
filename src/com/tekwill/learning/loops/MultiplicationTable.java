package com.tekwill.learning.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The number");
        int number = scanner.nextInt();
        System.out.println("Enter The range");
        int range = scanner.nextInt();
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }
    }
}
