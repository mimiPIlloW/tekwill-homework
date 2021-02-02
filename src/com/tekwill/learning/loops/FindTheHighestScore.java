package com.tekwill.learning.loops;

import java.util.Scanner;

public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestScore = 0;
        String highestScoreName = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter student’s name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String name = scanner.next();
            System.out.print("   Score: ");
            int score = scanner.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }
        System.out.println("Student score: " + highestScoreName);
    }
}

