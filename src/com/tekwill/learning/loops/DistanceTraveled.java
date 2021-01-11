package com.tekwill.learning.loops;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed");
        int speed = scanner.nextInt();
        System.out.println("Enter the hours");
        int time = scanner.nextInt();

        System.out.printf("%s%20s\n", "Hour", "Distance Traveled");
        System.out.println("------------------------");

        for (int i = 1; i <= time; i++) {
            int distance = speed * i;
            System.out.println(i + "           " + distance);
        }
    }
}
