package com.tekwill.learning.loops;

import java.util.Scanner;

public class BusinessCheckISBN13 {

    public static void main(String[] strings) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN as string: ");
        String s = scanner.next();

        if (s.length() != 12) {
            System.out.println(s + " is Invalid scanner");
            System.exit(0);
        }

        int checkSum = 0;
        for (int i = 0; i < s.length(); i++) {

            if ((i + 1) % 2 == 0) {
                checkSum +=  (s.charAt(i) - '0') * 3;

            } else {
                checkSum  += s.charAt(i) - '0';
            }
        }
        checkSum %= 10;
        checkSum = 10 - checkSum;
        if (checkSum == 10) s += "0";
        else  s += checkSum;

        System.out.println("The ISBN-13 number is " + s);
    }
}
