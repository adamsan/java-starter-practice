package com.codecool.datatstructure;

public class SimpleParensNestingChecker {
    public static void main(String[] args) {
        String s1 = "(((((())))))";
        System.out.println(isProperlyNested(s1)); // true

        String s2 = "(";
        System.out.println(isProperlyNested(s2)); // false

        String s3 = "))))((((";
        System.out.println(isProperlyNested(s3)); // false

        String s4 = "(()()())()(())";
        System.out.println(isProperlyNested(s4)); // true
    }

    /**
     * Check if the parenthesis are properly nested.
     * Throw IllegalArgumentException, if input is invalid (contains other characters, than parens).
     */
    private static boolean isProperlyNested(String str) {
        return false;
    }
}
