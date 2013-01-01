/**
 * Reference: http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/08-Sort/simple-sort.html
 */
package com.algo.sort;

import java.util.Arrays;

public class SelectionSorterTwo {

    public static void main(String[] args)
    {
        SelectionSorterTwo selectionSorter = new SelectionSorterTwo();
        Integer[] input=new Integer[]{9,4,11,3,5,8,0};
        selectionSorter.sort(input);
        System.out.println(Arrays.asList(input));
    }

    private void sort(Integer[] input) {

          for(int i=0;i<input.length;i++)
          {
             for(int j=i+1;j<input.length;j++)
             {
                 if(input[j]<input[i])
                 {
                     exchange(input,i,j);
                 }
             }
          }


    }

    private void exchange(Integer[] input, int i, int j) {
        //To change body of created methods use File | Settings | File Templates.
        int temp=input[i];
         input[i]=input[j];
         input[j]=temp;
    }
}
