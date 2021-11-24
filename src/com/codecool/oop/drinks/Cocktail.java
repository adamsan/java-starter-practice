package com.codecool.oop.drinks;

import java.util.Collections;
import java.util.List;

public class Cocktail extends Alcoholic {
    public final List<String> ingredients;

    public Cocktail(String name, int price, String quantity, double alkoholPercent, List<String> ingredients) {
        super(name, price, quantity, alkoholPercent);
        this.ingredients = Collections.unmodifiableList(ingredients);
    }
}
