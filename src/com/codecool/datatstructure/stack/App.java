package com.codecool.datatstructure.stack;

public class App {
    public static void main(String[] args) {
        CoolStack stack = new CoolStack();

        stack.push(3);
        stack.push(5);
        stack.push(23);
        stack.push(9);

        // When implemented, it should print 9; 23; 5; 3
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value + "; ");
        }
    }
}
