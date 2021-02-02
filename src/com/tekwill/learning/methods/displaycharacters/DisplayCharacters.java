package com.tekwill.learning.methods.displaycharacters;

public class DisplayCharacters {
    public static void main(String[] args) {
        int NUMBER_OF_CHARS_IN_LINE = 10;
        char ch1 = '1';
        char ch2 = 'Z';

        System.out.println("\nCharacters per 1 to Z");
        DisplayCharactersDemo.printCharacters(ch1, ch2, NUMBER_OF_CHARS_IN_LINE);
        System.out.println();
    }
}
