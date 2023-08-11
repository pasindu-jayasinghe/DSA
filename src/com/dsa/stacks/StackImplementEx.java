package com.dsa.stacks;

public class StackImplementEx {

    public static void main(String[] args) {
        StackEx stack = new StackEx();

        stack.push1(10);
        stack.push1(20);
        stack.push1(50);
        stack.push2(11);
        stack.push2(12);
        stack.pop1();
        stack.pop2();


        System.out.println(stack);
    }
}
