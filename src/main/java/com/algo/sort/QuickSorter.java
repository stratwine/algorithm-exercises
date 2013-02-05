/**
 * Reference: Vogella tutorial
 */
package com.algo.sort;

import java.util.Arrays;

public class QuickSorter {


    public static void main(String[] args)
    {
        QuickSorter quickSorter= new QuickSorter();
        Integer[] input=new Integer[]{9,4,11,3,5,8,0};
        quickSorter.quicksort(input, 0, input.length - 1);
        System.out.println(Arrays.asList(input));
    }

    void quicksort(Integer[] input, int low, int high) {
        int pivot = input[low+(high-low)/2];
        int leftPointer=low;
        int rightPointer=high;

        while(leftPointer<=rightPointer) // when they have not crossed over
        {
            //if current element in left list is smaller than the pivot,
            //the current element is in the correct list, so skip and
            //check the next one
            while(input[leftPointer]<pivot)
            {
                leftPointer++;
            }

            //if current element in the right list is greater than the pivot,
            //the current element is in the correct list, so skip and check the next one
            //check the next one
            while(input[rightPointer]>pivot)
            {
                rightPointer--;
            }

           //if it was a totally sorted list,
           // left and right pointers would have crossed over

          //if left had an odd element, it would have broken, and
          // left pointer would have been < right pointer

          // if righ list had an odd element, it would have broken and
          // right pointer would have been greater than the left pointer

          if(leftPointer<=rightPointer) //initial condition
          {
              exchange(input,leftPointer,rightPointer);
              leftPointer++;
              rightPointer--;
          }

        }

        //Now after the crossing over,
        //we have two ranges
        // low---rightPointer, leftPointer----high
        //sort them again

        if(low<rightPointer)
        {
            quicksort(input,low,rightPointer);

        }


        if(leftPointer<high)
        {
            quicksort(input,leftPointer,high);

        }
    }

    private void exchange(Integer[] input, int leftPointer, int rightPointer) {
        int temp=input[leftPointer];
        input[leftPointer]=input[rightPointer];
        input[rightPointer]=temp;


    }


}
