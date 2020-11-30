package com.tekwill.learning.basics;

public class ChairTablePrinter {
    public static void main(String[] args) {

        System.out.println("");

        System.out.println("X                      X\n" +
                "X                      X\n" +
                "X      XXXXXXXXXX      X\n" +
                "XXXXX  X        X  XXXXX\n" +
                "X   X  X        X  X   X\n" +
                "X   X  X        X  X   X");
        //So we can do
        System.out.println("");

        System.out.println("X                      X");
        System.out.println("X                      X");
        System.out.println("X      XXXXXXXXXX      X");
        System.out.println("XXXXX  X        X  XXXXX");
        System.out.println("X   X  X        X  X   X");
        System.out.println("X   X  X        X  X   X");
        //So
        System.out.println("");
        int a = 7;
        while (a > 0) {
            a--;
            if (a > 4) {
                System.out.println("X                      X");
            }
            if (a == 3) {
                System.out.println("X      XXXXXXXXXX      X");
            }
            if (a == 2) {
                System.out.println("XXXXX  X        X  XXXXX");
            }
            if (a <= 1) {
                System.out.println("X   X  X        X  X   X");
            }
//            System.out.println(a);
        }
    }
}
