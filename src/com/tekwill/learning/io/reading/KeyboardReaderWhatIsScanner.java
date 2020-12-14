package com.tekwill.learning.io.reading;

import java.util.Scanner;

public class KeyboardReaderWhatIsScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter e number");
        int integerReadFromKeyboard = scanner.nextInt();

        System.out.println("You entered" + integerReadFromKeyboard);
        System.out.println("Please now ");
        scanner.nextLine();
        String stringReadFromKeyboard = scanner.nextLine();
        System.out.println("you entered" + stringReadFromKeyboard);


    }
}
