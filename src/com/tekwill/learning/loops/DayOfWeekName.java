package com.tekwill.learning.loops;

import java.util.Scanner;

public class DayOfWeekName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input week number(1-7): ");
        int weekNumber = scanner.nextInt();
        switch (weekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }
    }
}
