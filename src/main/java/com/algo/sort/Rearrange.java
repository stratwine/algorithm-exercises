package com.algo.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array and a number k, arrange array such that all elements lesser than k are
 * to the left and all elements >k are to the right
 */

public class Rearrange {

   public static void main(String[] args)
   {
       Integer[] input = new Integer[]{2,15,12,6,3,8,56,3,45,1};
       int k=8;
       List list=rearrage(input,k);
       System.out.println(Arrays.asList(list));
   }

    private static List rearrage(Integer[] input, int k) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        int keyPosition=-1;

        for(int i=0;i<input.length;i++)
        {
            if(input[i]==k)
            {
               keyPosition=i;
            }
        }


        list.add(input[keyPosition]);

        for(int i=0;i<input.length;i++)
        {
            if(i==keyPosition)
            {
                continue;
            }
            else if(input[i]<=k)
            {
               list.addFirst(input[i]);
            }
            else{
                list.addLast(input[i]);
            }
        }

        return list;
    }



}
