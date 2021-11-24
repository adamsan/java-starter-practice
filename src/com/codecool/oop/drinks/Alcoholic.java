package com.codecool.oop.drinks;

public abstract class Alcoholic extends Drink {
    private final double alkoholPercent;

    public Alcoholic(String name, int price, String quantity, double alkoholPercent) {
        super(name, price, quantity);
        this.alkoholPercent = alkoholPercent;
    }
}
