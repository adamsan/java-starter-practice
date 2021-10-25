package com.codecool.codewars;

public class PlayWithMultidimensionalArrays {
    public static void main(String[] args) {

        double[][][] doubles = {{{1d, 2d}}};

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

    // add - adds 2 input arrays as vectors, only works for arrays with the same size

    // min - input is a 2d array, retuns with an array containing the minimums of each input array

    // max - input is a 2d array, retuns with an array containing the maximums of each input array

    // zip - input is 2 arrays, output is a 2d array, where the i-th array consists of the two i-th elements from the input arrays
    // zip({1,2,3}, {25,26,27}) -> {{1,25}, {2,26}, {3, 27}}
}
