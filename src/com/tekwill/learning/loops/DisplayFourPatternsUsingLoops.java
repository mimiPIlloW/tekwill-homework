package com.tekwill.learning.loops;

public class DisplayFourPatternsUsingLoops {
    public static void main(String[] args) {
        ///////////////////////////////
        System.out.println();
        System.out.println("Pattern A");
        for (int line = 1; line <= 6; line++) {
            for (int cols = 1; cols <= line ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
        ///////////////////////////////
        System.out.println();
        System.out.println("Pattern B");
        for (int line = 6; line >= 1; line--) {
            for (int c = 1; c <= line; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        ///////////////////////////////
        System.out.println();
        int numberOfLines = 6;
        System.out.println("Pattern C");
        for (int line = 1; line <= numberOfLines; line++) {
            for (int s = numberOfLines - line; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = line; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        ///////////////////////////////
        System.out.println();
        System.out.println("Pattern D");
        for (int line = 0; line < 6; line++) {
            for (int ws = 0; ws < line; ws++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - line; col++) {
                System.out.print((col + 1) + " ");
            }
            System.out.println();
        }
    }
}
