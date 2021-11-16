package com.codecool.datatstructure;

public class PrimitiveMap {
    public static void main(String[] args) {
        String w = "ABBAz Edda ACDC!";
        int[] map = characterOccuranceMap(w);
        printCharacterOccurance(map);
    }

    /**
     * Counts which character occurs how many times.
     * Returns with an array, where the indices are the characters,
     * and each value signifies how many times it occurs.
     * <p>
     * Example: The string "a" returns with an array full of 0 values, except on index 97 (value of 'a'),
     * where it's value is 1.
     */
    private static int[] characterOccuranceMap(String w) {
        return null;
    }

    /**
     * Prints out how many times each character occurs. Only print characters, that occur more than 0 times.
     */
    private static void printCharacterOccurance(int[] map) {
    }

}
