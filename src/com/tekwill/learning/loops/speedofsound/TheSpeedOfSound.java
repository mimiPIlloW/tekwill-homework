package com.tekwill.learning.loops.speedofsound;

import java.util.Scanner;

public class TheSpeedOfSound {

    public static void main(String[] args) {

        final double airSpeed = 1100;
        final double waterSpeed = 4900;
        final double steelSpeed = 16400;

        String Air = "Air";
        String Water = "Water";
        String Steel = "Steel";
        String s;
        System.out.println("|Medium           Speed|\n" +
                "------------------------");
        System.out.printf("|%-16s %.3f|\n|%-16s %.3f|\n|%-15s %.3f|\n", Air, airSpeed, Water, waterSpeed, Steel, steelSpeed);

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        boolean end = true;

        System.out.println();
        System.out.println("Enter Air, Water, or Steel: ");

        do {
            while (running) {
                s = scanner.nextLine();
                if (s.equals(Air)) {
                    System.out.println("Please enter a distance");
                    int distanceAir = scanner.nextInt();
                    double timeAir = distanceAir / airSpeed;
                    System.out.printf("Speed of sound is: %.5f\n", timeAir);
                    end = false;
                    break;
                }

                if (s.equals(Water)) {
                    System.out.println("Please enter a distance");
                    int distanceWater = scanner.nextInt();
                    double timeWater = distanceWater / waterSpeed;
                    System.out.printf("Speed of sound is: %.5f\n", timeWater);
                    end = false;
                    break;
                }

                if (s.equals(Steel)) {
                    System.out.println("Please enter a distance");
                    int distanceSteel = scanner.nextInt();
                    double timeSteel = distanceSteel / steelSpeed;
                    System.out.printf("Speed of sound is: %.5f\n", timeSteel);
                    end = false;
                    break;

                }
                System.out.println("Error please enter or Air,Water,Steel.");
            }
        }
        while (end);
        System.out.println("By");
    }
}


