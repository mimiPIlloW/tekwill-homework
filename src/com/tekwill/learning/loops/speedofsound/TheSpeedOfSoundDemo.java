package com.tekwill.learning.loops.speedofsound;

import java.util.Scanner;

public class TheSpeedOfSoundDemo {
    public static final double SPEED_OF_SOUND_IN_AIR_FEET_SEC = 1.100;
    public static final double SPEED_OF_SOUND_IN_WATER_FEET_SEC = 4.900;
    public static final double SPEED_OF_SOUND_IN_STEEL_FEET_SEC = 16.400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"air\", \"water\" or \"steel\" and the distance in feet");
        String env = scanner.nextLine();
        double distance = scanner.nextDouble();


        switch (env) {
            case "air":
                System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the air", distance / SPEED_OF_SOUND_IN_AIR_FEET_SEC, distance);
                break;
            case "water":
                System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the water", distance / SPEED_OF_SOUND_IN_WATER_FEET_SEC, distance);
                break;
            case "steel":
                System.out.printf("It takes %.2f seconds for sound to travel %.2f feet through the steel", distance / SPEED_OF_SOUND_IN_STEEL_FEET_SEC, distance);
                break;
            default:
                System.out.println("Error!!! Wrong input");
        }

    }
}