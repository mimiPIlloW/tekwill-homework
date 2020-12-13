package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class KnightDemo {
    public static void main(String[] args) {
        Knight warrior1 = new Knight("Mark");
        Knight warrior2 = new Knight("Arl");

        warrior1.age = 22;
        warrior2.age = 27;

        System.out.println(warrior1);
        warrior1.fight();
        System.out.println(warrior2);
        Knight.invokeMagic();
    }
}
