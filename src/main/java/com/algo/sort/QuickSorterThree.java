/**
 * Reference: Vogella tutorial
 */
package com.algo.sort;

import java.util.Arrays;

public class QuickSorterThree {


    public static void main(String[] args)
    {
        QuickSorterThree quickSorter= new QuickSorterThree();
        Integer[] input=new Integer[]{9,4,11,3,5,8,0};
        quickSorter.quicksort(input, 0, input.length - 1);
        System.out.println(Arrays.asList(input));
    }

    void quicksort(Integer[] input, int low, int high) {


    }

}
