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
}
