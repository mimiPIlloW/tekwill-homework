package com.tekwill.learning.datatypes;

public class Statistics {
    private final long currentWorldPopulation;

    private Statistics(long currentWorldPopulation1) {

        this.currentWorldPopulation = currentWorldPopulation1;
    }
//    public Statistics(){
//
//    }


    public static void main(String[] args) {
        Statistics sursa1 = new Statistics(7_831_436_009L);
        System.out.println("WORLD POPULATION");
        System.out.println(sursa1);
        sursa1.sSursa1();
//        Statistics sursa2 = new Statistics();
    }


    public void sSursa1() {
        int b = 2020;
        double d = 1.05;
        System.out.println("is currently (" + b + ") growing at a rate of around " + d + "% per year.");
    }

//    public void sSursa2() {
//        int b = 2020;
//        double d = 1.05;
//        System.out.println("is currently (" + b + ") growing at a rate of around " + d + "% per year.");
//    }

    @Override
    public String toString() {
        return currentWorldPopulation + " Current World Population";
    }
}


//        double number = 7831436009.;
//        DecimalFormat fDecimal = new DecimalFormat("#,###");
//        System.out.println(fDecimal.format(number));
//    }
//}