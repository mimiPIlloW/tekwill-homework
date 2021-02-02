package com.tekwill.learning.methods.displaymatrix;

public class DisplayMatrixOfOsAnd1SDemo {
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols ++) {
                System.out.print((int)(Math.random() * 2));
            }
            System.out.println();
        }
    }
}
