package com.codecool.oop.drinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Use OOP to model the following drinks menu:
 * <p>
 * Drinks [name, price, quantity, toString]
 * Alcoholic
 * Shot
 * - Whiskey 2cl 1200 Ft
 * Beer
 * - Soproni Ászok 0,5L 450 Ft
 * Wine
 * - Chardonnay 0,75l 515 Ft/dl
 * Cocktail
 * - Piña Colada 0,75l 1750 Ft
 * összetevők: Fehér rum, kókuszszirup, tejszín, ananászlé
 * Non-Alcoholic
 * Water
 * - Theodora szénsavmentes 0,33l 500 Ft
 * Soft Drink
 * - Sprite 5dl 800 Ft
 * - Fanta 5dl 800 Ft
 * Coffee
 * - Cappuccino 590 Ft
 * - Caffe Latte 590 Ft
 * Tee
 * - Házi jeges tea 400ml 900 FT
 * - Fekete tea 600ml 950 FT
 * - Egzotikus gyümölcs tea 1000ml 1200 FT
 */
public class App {
    public static void main(String[] args) {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Shot("Whiskey", 1200, "2cl", 45));
        drinks.add(new Beer("Soproni Ászok", 450, "0.5L", 4));
        drinks.add(new Wine("Chardonnay", 515, "0.75L", 12));
        drinks.add(new Cocktail("Piña Colada", 1750, "0.75L", 20,
                Arrays.asList("White rum", "Coconut syrup", "Cream", "Pinapples")
        ));

        drinks.add(new Water("Theodora szénsavmentes", 500, "0.33L"));
        drinks.add(new SoftDrink("Sprite", 800, "5dl"));
        drinks.add(new SoftDrink("Fanta", 800, "5dl"));
        drinks.add(new Coffee("Cappuccino", 590, "1 cup"));
        drinks.add(new Coffee("Caffe Latte", 590, "1 cup"));
        drinks.add(new Tee("Házi jeges tea", 900, "400ml"));
        drinks.add(new Tee("Fekete tea", 950, "600ml"));
        drinks.add(new Tee("Egzotikus gyümölcs tea", 1200, "1L"));

        printDrinkMenu(drinks);
    }

    private static void printDrinkMenu(List<Drink> drinks) {
        for (Drink d : drinks) {
            System.out.println(d);
        }
    }
}
