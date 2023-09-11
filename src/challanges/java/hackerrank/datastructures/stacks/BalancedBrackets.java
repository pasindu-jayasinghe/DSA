package challanges.java.hackerrank.datastructures.stacks;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.empty()) return "NO";
                var top = stack.pop();
                if(bracketMatch(top,ch)) return "NO";
            }

        }
        if(stack.empty()) return "YES";
        else{return "NO";}

    }

    public static boolean bracketMatch(char top, char close){
        return ((top != '(' && close == ')') ||
                (top != '{' && close == '}') ||
                (top != '[' && close == ']'));

    }



    public static void main(String[] args) {
        //String str = "(([1] + <2>))[a]";
        String str = "{(([])[])[]}[]";
        System.out.println(isBalanced(str));
    }
}
