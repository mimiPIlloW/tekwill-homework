package com.tekwill.learning.methods.conversions;

import static com.tekwill.learning.methods.conversions.ConvertFootMeterMeterFoot.*;

public class ConversionsBetweenFeetAndMeters {
    public static void main(String[] args) {
        System.out.println("\nFeet     Meters     |     Meters     Feet\n" +
                "----------------------------------------------");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            System.out.printf("%4.1f     ", feet);
            System.out.printf("%6.3f", footMeter(feet));
            System.out.print("     |     ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterFoot(meters));
        }
    }
}
