package com.tekwill.learning.loops;

import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i)))
                count++;
        }

        System.out.println("Tne number of uppercase letters is " + count);
    }
}
