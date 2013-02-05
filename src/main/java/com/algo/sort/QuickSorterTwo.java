package com.algo.sort;

import java.util.Arrays;

public class QuickSorterTwo {

    public static void main(String[] args)
    {
        QuickSorterTwo quickSorter= new QuickSorterTwo();
        Integer[] input=new Integer[]{9,4,11,3,5,8,0};
        quickSorter.quicksort(input, 0, input.length - 1);
        System.out.println(Arrays.asList(input));
    }

    private void quicksort(Integer[] input, int low, int high) {
        int leftPointer = low;
        int rightPointer = high;
        int pivot = input[low+(high-low)/2];

        // when leftPointer and rightPointer have not crossed over,
        //iterate and check

        while(leftPointer<=rightPointer)
        {

            //while the left list element is smaller than the pivot,
            //we don't care, so skip to next
            while(input[leftPointer]<pivot)
            {
                leftPointer++;
            }

            //while the right list element is greater than the pivot,
            //we don't care. so skip and go to next
            while(input[rightPointer]>pivot)
            {
                rightPointer--;
            }

            //if leftPointer has not gone past its boundary
            //swap
            if(leftPointer<=rightPointer)
            {
                exchange(input,leftPointer,rightPointer);
                leftPointer++;
                rightPointer--;

            }


            //rightPointer is the deciding factor for sorting the rightList
            //if there area any elements to the left of rightPointer, then sort
            if(low<=rightPointer)
            {
                quicksort(input,low,rightPointer);
            }

            //leftPointer is the deciding factor to sort the left list.
            //if there are any elements to the right of leftPointer, then sort
            if(high>leftPointer)
            {
                quicksort(input,leftPointer,high);
            }

        }
    }

    private void exchange(Integer[] input, int leftPointer, int rightPointer) {
        //To change body of created methods use File | Settings | File Templates.

        int temp=input[leftPointer];
        input[leftPointer]=input[rightPointer];
        input[rightPointer]=temp;
    }

}
