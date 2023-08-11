package com.dsa.stacks;

import java.sql.Array;

public class StackImplement {


    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(50);
        System.out.println(stack.peek());


        System.out.println(stack);
    }


}


