package com.algo.problems;


/**
 * Find if a given string contains duplicate characters without extra array etc
 */
public class FindDuplicate {

    public static void main(String[] args)
    {
        String input="heooipdt";
        System.out.println(isWithDuplicates(input));
    }

    private static boolean isWithDuplicates(String input) {
        boolean isWithDuplicates=false;
        for(int i=0;i<input.length();i++)
        {
            for(int j=i+1;j<input.length();j++)
            {
                if(input.charAt(i)==input.charAt(j)){
                   isWithDuplicates=true;
                }
            }
        }
        return isWithDuplicates;
    }

}
