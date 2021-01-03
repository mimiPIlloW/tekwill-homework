package com.tekwill.learning.loops;

import java.util.Scanner;

public class IntegerInCodASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 127");
        int integerBetween0and127 = scanner.nextInt();
        if (integerBetween0and127 >= 0 && integerBetween0and127 <= 127) {
            System.out.println("The character for ASCII is " + (char) integerBetween0and127);
        } else {
            System.out.println("ERROR");
        }
    }
}


