package com.dsa.stacks;

import java.util.Stack;

public class BalancedExpression {

    public static void main(String[] args) {
        //String str = "(([1] + <2>))[a]";
        String str = "{(([])[])[]]}";
        System.out.println(isBalance(str));
    }

    public static boolean isBalance(String input) {
        Stack<Character> stack = new Stack<>();
        for (char item : input.toCharArray()) {
            switch (item) {
                case '(':
                case '[':
                case '<':
                    stack.push(item);
                    break;
                case ')':
                case ']':
                case '>':
                    if (stack.empty()) return false;
                    var top = stack.pop();
                    if (bracketMatch(item, top)) return false;
                    break;
                default:
                    // code block
            }
        }
        return stack.empty();
    }

    private static boolean bracketMatch(char right, char left) {
        return  (left != '(' && right == ')') ||
                (left != '<' && right == '>') ||
                (left != '[' && right == ']');
    }
}
