package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class GeometryAreaOfAPentagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length ");
        double radius = scanner.nextDouble();

        double lengthOfASide = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * lengthOfASide * lengthOfASide) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f", area);


    }
}
