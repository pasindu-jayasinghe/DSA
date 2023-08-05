package com.dsa.stacks;

/*STACKS = Store/Accessing Objects in different way
 *LIFO(Last In First Out)
 *Stacks use for
    *Implementing undo features
    *Build compilers
    *Evaluate expressions
    *Navigation (Back/Forward)
 *4 Operations
    1.push(item) - add item to top
    2.pop() - remove item from top
    3.peek() - remove item from top without removing it from the stack
    4.isEmpty() - stack is empty or not
 */


import java.util.Stack;

public class Stacks_1 {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();

        System.out.println(top);
        System.out.println(stack);

    }
}
