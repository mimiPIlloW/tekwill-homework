package com.tekwill.learning.methods.displaypatterns;

public class DisplayPatternsDemo {
    public static void displayPatternDemoIs(int n) {
        int padding = n - 1;
        for (int r = 1; r <= n; r++) {
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            padding--;
        }
    }
}

