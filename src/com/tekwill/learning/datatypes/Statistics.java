package com.tekwill.learning.datatypes;

public class Statistics {
    long population = 7831436009L;
    int year = 2010;
    double rateOfAround = 1.05;
    String currentWorldPopulation = " Current World Population";
    String world = "World Population Prospect the 2019 Revision - United Nations,\nDepartment of Economic and Social Affairs, Population Division\n(June 2019)";
    String census = "International Programs Center at the U.S. Census Bureau,\nPopulation Division";


    public static void main(String[] args) {
        Statistics population = new Statistics();
        System.out.println("World Population");
        System.out.println(population.population + population.currentWorldPopulation);
        System.out.println("is currently (" + population.year + ") growing at a rate of around " + population.rateOfAround + "% per year.");
        System.out.println(population.world);
        System.out.println(population.census);

    }

}
