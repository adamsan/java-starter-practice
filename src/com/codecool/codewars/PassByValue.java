package com.codecool.codewars;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {
        int number = 3;
        make55(3);
        System.out.println(number);

        int nums[] = {4, 5, 6};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        make55(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void make55(int[] nums) {
        nums[0] = 55;
    }

    static int make55(int number) {
        number = 55;
        return number;
    }
}
