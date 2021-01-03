package com.tekwill.learning.loops;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String letterIs = scanner.nextLine();
        char ch = letterIs.charAt(0);
        if (Character.isLetter(ch)) {
            switch (Character.toUpperCase(ch)) {
                case 'A':
                case 'O':
                case 'I':
                case 'U':
                case 'E':
                case 'Y':
                    System.out.println(letterIs + " is a vowel");
                default:
                    System.out.println(letterIs + " is a consonant");
            }
        } else {
            System.out.println("Error");
        }
    }
}
