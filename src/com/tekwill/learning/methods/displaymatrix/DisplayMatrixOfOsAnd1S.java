package com.tekwill.learning.methods.displaymatrix;

import java.util.Scanner;

import static com.tekwill.learning.methods.displaymatrix.DisplayMatrixOfOsAnd1SDemo.printMatrix;

public class DisplayMatrixOfOsAnd1S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        printMatrix(n);
    }
}
