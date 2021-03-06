package com.codecool.codewars;

import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {
//         foobar("Bela", 4);
//        booleans();
//        arrays();
        printTruthTable();
    }

    private static void arrays() {
        int[] arr = new int[2];
        int[] arr2 = {1, 2, 3};
        int[][] ndim = {{1, 2, 3}, {2}, {124}, {1, 2, 3, 34, 4}, {}};
        int[][] ndim2 = new int[4][];
        for (int i = 0; i < ndim2.length; i++) {
            ndim2[i] = new int[i];
        }
        ndim2[0] = new int[]{1, 2, 3};
        System.out.println(Arrays.deepToString(ndim2));
    }

    /**
     * Should print a truth table for the expression:
     * - print a header, with all input variables of the expresson
     * - print each row with all possible values the variables can take, also with the value of the expression (1 if true, 0 if false)
     * Example for `a or b`:
     A B AorB
     0 0 0
     0 1 1
     1 0 1
     1 1 1
     */
    private static void printTruthTable() {
        // expression = a || b && c
    }

    public static void foobar(String name, int times) {
        if (times < 0) return;
        switch (name) {
            case "A":
                System.out.println("Adam");
                break;
            case "B":
                System.out.println("Bela");
            default:
                System.out.println("Gipsz Jakab");
        }
        for (int i = 0, k = 0; i < times || k < 5; i++, k += 2) {
            System.out.println(i + " " + name + " " + k);
        }

        char[] nameArray = name.toCharArray();
        int j = 0;
        for (char ch : nameArray) {
            System.out.println(ch + (j + " asdasdad"));
        }

        boolean a = false, b = true, c = true;
        System.out.println(a || b && c);
    }
}
