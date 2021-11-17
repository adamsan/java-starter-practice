package com.codecool.datatstructure.stack;

/**
 * CoolStack will be a simple implementation of the stack data structure. (LIFO - Last In First Out)
 * Internally use an array to store the values, don't use collections.
 */
public class CoolStack {
    int[] values = new int[3];
    int size = 0;

    public void push(int i) {
        if (size == values.length) {
            grow();
        }
        values[size++] = i;
    }

    private void grow() {
        int[] newValues = new int[values.length * 2];
        for (int j = 0; j < values.length; j++) {
            newValues[j] = values[j];
        }
        values = newValues;
    }

    public int pop() {
        return values[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
