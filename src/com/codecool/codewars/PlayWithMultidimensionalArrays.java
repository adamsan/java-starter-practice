package com.codecool.codewars;

import java.util.Arrays;

public class PlayWithMultidimensionalArrays {
    public static void main(String[] args) {

        defineAndIterateOnArrays();

        int[] addResult = add(new int[]{1, 2, 3, 0}, new int[]{1, 10, 20, 5});
        System.out.println("add: " + Arrays.toString(addResult)); // 2 12 23 5

        int[][] arr2d = {{1, 2, 3}, {3, -1, 5, 9}, {20, 1, 55}};
        int[] minimums = min(arr2d);
        System.out.println("min: " + Arrays.toString(minimums)); // 1 -1 1
        int[] maximums = max(arr2d);
        System.out.println("max: " + Arrays.toString(maximums)); // 1 -1 1

        int[][] zipped = zip(new int[]{1, 2, 3}, new int[]{25, 26, 27});
        System.out.println("zip: " + Arrays.deepToString(zipped));
    }

    private static void defineAndIterateOnArrays() {
        int[][] nums = {
                {1, 2, 3},
                {5, 6, 7, 8, 9},
        };

        System.out.println(nums[0][0]); // 1
        System.out.println(nums[1][4]); // 9

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    /** min - input is a 2d array, retuns with an array containing the minimums of each input array */
    private static int[] min(int[][] arr2d) {
        int[] result = new int[arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            result[i] = min(arr2d[i]);
        }
        return result;
    }

    /** max - input is a 2d array, retuns with an array containing the maximums of each input array */
    private static int[] max(int[][] arr2d) {
        int[] result = new int[arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            result[i] = max(arr2d[i]);
        }
        return result;
    }

    private static int max(int[] ints) {
        int max = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int min(int[] ints) {
        int min = ints[0];
        for (int i : ints) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /** add - adds 2 input arrays as vectors, only works for arrays with the same size */
    private static int[] add(int[] a, int[] b) {
        if (a.length != b.length) throw new IllegalArgumentException("Input arrays must have the same length");

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    /** zip - input is 2 arrays, output is a 2d array, where the i-th array consists of the two i-th elements from the input arrays
    // zip({1,2,3}, {25,26,27}) -> {{1,25}, {2,26}, {3, 27}} */
    private static int[][] zip(int[] a, int[] b) {
        int len = Math.min(a.length, b.length);
        int[][] result = new int[len][2];

        for (int i = 0; i < result.length; i++) {
            result[i][0] = a[i];
            result[i][1] = b[i];
        }
        return result;
    }
}
