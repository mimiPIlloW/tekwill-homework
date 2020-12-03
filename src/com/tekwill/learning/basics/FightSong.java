package com.tekwill.learning.basics;

public class FightSong {
    public static void main(String[] args) {
        GoTeamGo();
        System.out.println();
        SixLineSupport();
        System.out.println();
        SixLineSupport();
        System.out.println();
        GoTeamGo();
    }

    public static void GoTeamGo() {
        System.out.println("Go, team, go!\n" +
                "You can do it.");
    }

    public static void BestInTheWest() {
        System.out.println("You're the best,\n" +
                "in the West.");
    }

    public static void SixLineSupport() {
        GoTeamGo();
        BestInTheWest();
        GoTeamGo();
    }
}
