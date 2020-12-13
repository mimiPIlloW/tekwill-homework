package com.tekwill.learning.basics;

public class LarnTerns {
    public static void main(String[] args) {
        top();
        System.out.println();
        top();
        middle();
        piece();
        top();
        System.out.println();
        top();
        bottom();
        middle();
        middle();
        bottom();
        bottom();
    }

    public static void top() {
        System.out.println("    *****    \n" +
                "  *********  \n" +
                "*************");
    }

    public static void middle() {
        System.out.println("* | | | | | *");
    }

    public static void piece() {
        System.out.println("*************");
    }

    public static void bottom() {
        System.out.println("    *****    ");
    }
}
