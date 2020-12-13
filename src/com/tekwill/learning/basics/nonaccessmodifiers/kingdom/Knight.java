package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class Knight {
    public int age;
    private final String nickname;
    static String guild = "Invoker";

    public Knight(String nickname) {
        this.nickname = nickname;
    }

    public static void invokeMagic() {
        System.out.println("Maaaagic");
    }

    public void fight() {
        System.out.println("Fight");
    }

    @Override
    public String toString() {
        return "The knight: " + nickname + " is " + age + " years old!\n" + "of the guild: " + guild;
    }
}


