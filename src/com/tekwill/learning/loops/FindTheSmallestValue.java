package com.tekwill.learning.loops;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        System.out.println("Enter how many number you want?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("enter number");
        for (int i = 1; i < number; i++) {
            i = scanner.nextInt();
        }
    }
}
