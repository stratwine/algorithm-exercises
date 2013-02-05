package com.algo.sort;

//http://rosettacode.org/wiki/Sorting_algorithms/Bubble_sort#Java

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args)
    {
        BubbleSort sorter = new BubbleSort();
        Integer[] input=new Integer[]{9,4,11,3,5,8,0};
        sorter.sort(input);
        System.out.println(Arrays.asList(input));
    }

    private void sort(Integer[] input) {
        //To change body of created methods use File | Settings | File Templates.
        boolean swapped=false;
        do
        {

          swapped=false;
          for(int i=0;i<input.length-1;i++)
          {
              if(input[i]>input[i+1])
              {
                  exchange(input,i,i+1);
                  swapped=true;
              }

          }


        }
        while(swapped);
    }

    private void exchange(Integer[] input, int i, int j) {
        int temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }

}
