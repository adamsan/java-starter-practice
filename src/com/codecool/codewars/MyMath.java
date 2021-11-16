package com.codecool.codewars;

public class MyMath {
    public static void main(String[] args) {
        System.out.println(useOperator("2 3 2".split(" "), "+"));
        System.out.println(useOperator("2 3 2".split(" "), "*"));

        System.out.println(useOperator(new String[]{"100", "2", "kutya"}, "*"));

        System.out.println(useOperator(new String[]{"100", "2", null}, "*"));

        System.out.println(useOperator("1 2 3".split(" "), null));
        System.out.println(useOperator("1 2 3".split(" "), "bakfitty"));

    }

    public static int useOperator(String[] nums, String op) {
        if (nums == null) return 0;
        if (!isValidOp(op)) return 0;

        return "+".equals(op) ? sum(nums) : prod(nums);
    }

    private static int prod(String[] nums) {
        int prod = 1;
        for (String s : nums) {
            if (s != null) {
                try {
                    int num = Integer.parseInt(s);
                    prod *= num;
                } catch (NumberFormatException e) {
                }
            }
        }
        return prod;
    }

    private static int sum(String[] nums) {
        int sum = 0;
        for (String s : nums) {
            if (s != null) {
                try {
                    int num = Integer.parseInt(s);
                    sum += num;
                } catch (NumberFormatException e) {
                }
            }
        }
        return sum;
    }

    private static boolean isValidOp(String op) {
        return "*".equals(op) || "+".equals(op);
    }
}
