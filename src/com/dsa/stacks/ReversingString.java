package com.dsa.stacks;

import java.util.Stack;

public class ReversingString {

    public static void main(String[] args) {
        String str = "abcd";
        String rev = reverse(str);
        System.out.println(rev);
    }

    public static String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char item : input.toCharArray()) {
            stack.push(item);
        }
//      String newStr = "";
//      String is immutable So we can use StringBuffer
        StringBuffer revered = new StringBuffer();
        while (!stack.isEmpty()) {
            revered.append(stack.pop());
//          newStr += stack.pop();
        }

        return revered.toString();
    }

}
