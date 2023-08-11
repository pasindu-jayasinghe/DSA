package com.dsa.stacks;




public class StackEx {

    private int[] array = new int[10];
    private int count1;
    private int count2 = array.length - 1;

    public void push1(int item) {
        if (count1 == array.length)
            throw new StackOverflowError();

        if(array[count1] != 0)
            throw new StackOverflowError();

        array[count1++] = item;

    }

    public void push2(int item) {

        if (count2 < 0)
            throw new StackOverflowError();

        if(array[count2] != 0)
            throw new StackOverflowError();

        array[count2--] = item;

    }
}
