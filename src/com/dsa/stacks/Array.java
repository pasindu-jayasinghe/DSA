package com.dsa.stacks;

import java.util.Stack;

public class Array {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        Stack<Integer> stack = new Stack<>();

        for(int x: array) {
            stack.push(x);

        }

        System.out.printf(stack.toString());
    }
}
