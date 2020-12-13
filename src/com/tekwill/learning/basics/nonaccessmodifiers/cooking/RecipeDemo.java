package com.tekwill.learning.basics.nonaccessmodifiers.cooking;

public class RecipeDemo {
    public static void main(String[] args) {
        Recipe r1 = new Recipe("fried pies with potatoes",
                "For the test:\n" +
                        "Dry fast-acting yeast - 7 g\n" +
                        "Sugar - 1 tbsp. the spoon\n" +
                        "Salt - 1 tsp\n" +
                        "Water - 300 ml\n" +
                        "Vegetable oil - 50 g\n" +
                        "*\n" +
                        "For filling:\n" +
                        "Potatoes - 500 g\n" +
                        "Bulb onions - 1 pc.\n" +
                        "Salt to taste " + "Ground black pepper - to taste\n" +
                        "*\n" +
                        "Vegetable oil - for frying onions and pies");
        System.out.println(r1);
        r1.update();
        Recipe.markAsCooked();

    }

}

