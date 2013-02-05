package com.algo.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n=8;
        int result=fibonacci(n);
        System.out.println("Fibonacci number at the digit:"+result);
    }

    private static int fibonacci(int n) {

        if(n==1) {return 0;}
        if(n==2) {return 1;}
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
