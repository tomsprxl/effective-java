package com.liangxu.effectivejava.demo002.demo02;

public class NutritionFacts {
    private final int servingSize = -1; // (mL) required
    private final int servings = -1; // (per container) required
    private final int calories = 0; // (per serving) optional
    private final int fat = 0; // (g/serving) optional
    private final int sodium = 0; // (mg/serving) optional
    private final int carbohydrate = 0; // (g/serving) optional

    public NutritionFacts() {
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }
}
