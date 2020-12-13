package com.tekwill.learning.basics.nonaccessmodifiers.cooking;


public class Recipe {

    final String title;
    final String description;
    static String source_url = "russianfood.com/recipes/recipe.php?rid=152998";


    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void update() {
        System.out.println("Updated");

    }

    public static void markAsCooked() {
        System.out.println("Cooooked!");
    }

    @Override
    public String toString() {
        return "The most delicious pies: " + source_url + "\n" +
                "Grandma calls them " + title + "\n" +
                "ingredients to make them:\n" + description;
    }
}