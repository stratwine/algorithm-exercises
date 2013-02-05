package com.algo.problems;


import com.sun.xml.internal.ws.client.BindingProviderProperties;

/**
 * Find if a given string contains duplicate characters without extra array etc
 */
public class FindDuplicateTwo {

    public static void main(String[] args)
    {
        String input="heoipdt";
        System.out.println(isWithDuplicates(input));
    }

    private static boolean isWithDuplicates(String input) {

        boolean[] checkFlag = new boolean[256];

        for(int i=0;i<input.length();i++)
        {
           int k=input.charAt(i);
           if(checkFlag[k]){return true;}
           else{
               checkFlag[k]=true;
           }
        }
        return false;
    }

}
