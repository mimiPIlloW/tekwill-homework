package com.tekwill.learning.methods.pentagonalnumber;

import static com.tekwill.learning.methods.pentagonalnumber.MathPentagonalNumbers.getPentagonalNumber;

public class MathPentagonalNumbersDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(getPentagonalNumber(i + 1) + ", ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}
