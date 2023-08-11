package com.dsa.stacks;

import java.util.Arrays;

public class Stack {

    private int count;
    private int[] array = new int[5];


    public void push(int item) {
        if (count == array.length)
            throw new StackOverflowError();

        array[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException();

        return array[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException();

        return array[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }
}
