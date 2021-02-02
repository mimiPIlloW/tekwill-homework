package com.tekwill.learning.loops;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        int index = 0;
        String prefix = "";

        while (string1.charAt(index) == string2.charAt(index)) {
            prefix += string1.charAt(index);
            index++;
        }

        if (prefix.length() > 0)
            System.out.println("The commmon prefix is " + prefix);
        else
            System.out.println(string1 + " and " + string2 +
                    " have no commmon prefix");
    }
}
