package com.algo.sort;

import java.util.Arrays;

/**
 * Given a number, arrange lesser numbers to left and greater numbers to right
 * tinyurl.com/bg99tr8
 */
public class RearrangeThreeWayPartition {

    public static void main(String[] args)
    {
        Integer input[] = new Integer[]{1,23,16,9,5,87,5,4,23,6,45};
        int keyPosition=3;

        threeWayPartition(input, 23);
        System.out.println(Arrays.asList(input));
    }


    public static void threeWayPartition(Integer[] a, int pivot)
    {
        int p = 0;
        int q = a.length - 1;
        for(int i = 0; i <= q;) {
            if(a[i] < pivot) swap(a, i++, p++);
            else if(a[i] > pivot) swap(a, i, q--);
            else i++;
        }
    }


    private static void swap(Integer[] a, int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

   /* private static void rearrange(Integer[] input, int keyPosition,int leftPointer, int rightPointer) {

        while(leftPointer<=keyPosition)
        {
            while(input[leftPointer]<input[keyPosition])
            {
                leftPointer++;
            }

            while(input[rightPointer]>input[keyPosition])
            {
                rightPointer--;
            }

            if(leftPointer<rightPointer)
            {
                exchange(input,leftPointer,rightPointer);
                leftPointer++;
                rightPointer--;
            }


        }

        System.out.println(leftPointer);
        //rearrange(input,keyPosition,leftPointer,rightPointer);

    }

    private static void exchange(Integer[] input, int leftPointer, int rightPointer) {
        int temp=input[leftPointer];
        input[leftPointer]=input[rightPointer];
        input[rightPointer]=temp;

    }*/
}
