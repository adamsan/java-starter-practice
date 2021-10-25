package com.codecool.codewars;


public class Main {

    public static void main(String[] args) {
        int value;
        value = -1;
        for (int i = 0; i < 5; i++) {
            value = sqr(i);
            System.out.println(value);
        }
        System.out.println(value);
    }

    public static int sqr(int number) {
        int result;
        if (number < 0) {
            result = 0;
        } else {
            result = number * number;
        }
        return result;
    }
}