package com.codecool.recursion;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fact(i));
        }
    }

    /**
     * Calculates the i-th factorial
     * fact(0) = 1
     * fact(n) = n * fact(n-1)
     */
    private static int fact(int i) {
        if (i <= 1) return 1;
        return i * fact(i - 1);
    }
}
