package com.codecool.recursion;

public class SumArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 12, 11, 55};
        System.out.println(sumArray(nums)); //88
    }

    private static int sumArray(int[] nums) {
        //TODO: Calculate the sum of the nums array, use a recursive function.
        //HINT: Use a private helper method with additional parameters.
        return recSum(nums, 0, 0);
    }

    private static int recSum1(int[] nums, int i) {
        if (i == nums.length) return 0;
        return nums[i] + recSum1(nums, i + 1);
    }

    private static int recSum(int[] nums, int i, int sum) {
        if (nums.length == i) return sum;
        return recSum(nums, i + 1, sum + nums[i]);
    }
}
