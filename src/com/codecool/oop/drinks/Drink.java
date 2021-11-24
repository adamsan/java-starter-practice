package com.codecool.oop.drinks;

public abstract class Drink {
    public final String name;
    public final int price;
    private String quantity;

    public Drink(String name, int price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
