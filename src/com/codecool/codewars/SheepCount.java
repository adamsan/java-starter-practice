package com.codecool.codewars;

public class SheepCount {
    public static void main(String[] args) {
        int sheepCount = count("sheep", args);
        int wolfCount = count("wolf", args);

        System.out.println("Sheeps counted: " + sheepCount);
        System.out.println("Wolfs counted: " + wolfCount);
    }

    private static int count(String target, String[] strings) {
        int count = 0;
        for (String el : strings) {
            if (target.equals(el)) {
                count++;
            }
        }
        return count;
    }
}
