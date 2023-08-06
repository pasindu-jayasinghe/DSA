package com.dsa.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression2 {


    private static final List<Character> leftBracket = Arrays.asList('(','[','<');
    private static final List<Character> rightBracket = Arrays.asList(')',']','>');

    public static void main(String[] args) {
        String str = "(([1] + <2>))[a]";
        System.out.println(isBalance(str));
    }

    public static boolean isBalance(String input) {
        Stack<Character> stack = new Stack<>();
        for (char item : input.toCharArray()) {
            if (isLeftBracket(item))
                stack.push(item);
            if (isRightBracket(item)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!bracketMatch(item, top)) return false;
            }
        }
        return stack.empty();
    }

    private static boolean bracketMatch(char right, char left) {
        return leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }

    private static boolean isLeftBracket(char ch) {
        return leftBracket.contains(ch);
    }

    private static boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
    }
}
