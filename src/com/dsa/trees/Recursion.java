package com.dsa.trees;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

//    public static int factorial(int n){
//        int factorial = 1;
//        for (int i = n; i>1; i--){
//            factorial *= i;
//        }
//        return factorial;
//    }

    public static int factorial(int n){
        if(n == 0)
            return 1;
        
        return n * factorial(n-1);
    }
}
