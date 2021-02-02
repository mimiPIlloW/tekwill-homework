package com.tekwill.learning.loops;

import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        String oddPositions = "";

        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }
        System.out.println(oddPositions);
    }
}
