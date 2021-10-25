package com.codecool.codewars;

import java.util.Arrays;

public class PlayWithArrays {
    public static void main(String[] args) {

        int[] myArray = new int[5];
        int i = 3;
        myArray[0] = 12;
        myArray[i] = 112;
        System.out.println(myArray[3]);

        System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] nums = {5, 6, 11};
        System.out.println(Arrays.toString(nums));
    }
}
