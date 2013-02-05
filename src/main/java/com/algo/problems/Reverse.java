package com.algo.problems;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 6/1/13
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class Reverse {

    public static void main(String [] args)
    {
        String input = "abcd\n";

        for(int i=input.length()-2;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }
    }
}
