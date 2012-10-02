package com.algo.sort;

import java.util.Arrays;

public class SelectionSorter {

    public void sort(Integer[] numbers)
    {
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[j]<numbers[i])
                {
                    int t=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=t;

                }
            }
        }
    }

    public static void main(String[] args)
    {
       SelectionSorter selectionSorter = new SelectionSorter();
       Integer[] input=new Integer[]{9,4,11,3,5,8,0};
       selectionSorter.sort(input);
       System.out.println(Arrays.asList(input));
    }

}


