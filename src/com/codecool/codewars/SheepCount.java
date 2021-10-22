package com.codecool.codewars;

public class SheepCount {
    public static void main(String[] args) {
        int sheepCount = count("wolf", args);
        int wolfCount = count("sheep", args);

//        int sheepCount = 0;
//        int wolfCount = 0;
//        for (String arg : args) {
//            if ("sheep".equals(arg)) {
//                sheepCount++;
//            } else if ("wolf".equals(arg)) {
//                wolfCount++;
//            }
//        }
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
