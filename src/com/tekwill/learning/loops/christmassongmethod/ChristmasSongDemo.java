package com.tekwill.learning.loops.christmassongmethod;

import static com.tekwill.learning.loops.christmassongmethod.ChristmasSong.printDay;
import static com.tekwill.learning.loops.christmassongmethod.ChristmasSong.printVerse;

public class ChristmasSongDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.print("On the ");
            printDay(i);
            System.out.println(" day of Christmas\nMy true love sent to me:");
            for (int j = 12; j >= 1; j--) {
                if (j <= i) {
                    printVerse(j);
                }
            }
        }
    }
}
