package com.dsa.stacks;


import java.util.Arrays;

public class StackEx {

    private int[] array = new int[10];
    private int count1;
    private int count2 = array.length - 1;

    public void push1(int item) {
        if (count1 == array.length)
            throw new StackOverflowError();

        if (array[count1] != 0)
            throw new StackOverflowError();

        array[count1++] = item;

    }

    public void push2(int item) {
        if (count2 < 0)
            throw new IllegalStateException();

        if (array[count2] != 0)
            throw new IllegalStateException();

        array[count2--] = item;

    }

    public int pop1() {
        if (count1 == 0)
            throw new IllegalStateException();

        return array[--count1];

    }

    public int pop2() {
        if (count2 == array.length)
            throw new IllegalStateException();

        return array[++count2];

    }

    @Override
    public String toString() {
        var content1 = Arrays.copyOfRange(array, 0, count1);
        var content2 = Arrays.copyOfRange(array, count2 + 1, array.length);

        return "Stack 1: " + Arrays.toString(content1) + "\nStack 2: " + Arrays.toString(content2);
    }
}
