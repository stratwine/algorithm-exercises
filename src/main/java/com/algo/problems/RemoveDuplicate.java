package com.algo.problems;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Find if a given string contains duplicate characters without extra array etc
 */
public class RemoveDuplicate {

    public static void main(String[] args)
    {
        Character[] input= new Character[]{'a','g','s','a'};
        LinkedList list=new LinkedList(Arrays.asList(input));
        removeDups(list);
        System.out.println(list);
    }

    private static void removeDups(List list) {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                }
            }
        }

    }

}
