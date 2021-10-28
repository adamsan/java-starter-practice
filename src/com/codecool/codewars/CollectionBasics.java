package com.codecool.codewars;

import java.util.ArrayList;
import java.util.List;

public class CollectionBasics {
    public static void main(String[] args) {
        tryLists();
    }

    private static void tryLists() {
        List<String> countries = new ArrayList<>();
        countries.add("Hungary");
        countries.add("Germany");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("Hungary");
        System.out.println(countries);
        removeNthOccurance(countries, "Germany", 2);
        System.out.println(countries);
    }

    private static void removeNthOccurance(List<String> strings, String toRemove, int n) {
        int nthIndex = -1;
        for (int i = strings.indexOf(toRemove); i < strings.size() && n > 0; i++) {
            if (strings.get(i).equals(toRemove)) {
                n--;
                if (n == 0) {
                    nthIndex = i;
                }
            }
        }
        if (nthIndex >= 0)
            strings.remove(nthIndex);
    }
}
