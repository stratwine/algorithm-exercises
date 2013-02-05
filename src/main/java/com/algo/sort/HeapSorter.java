package com.algo.sort;

import java.util.Arrays;

public class HeapSorter {


    public static void main(String[] args) {
        HeapSorter sorter = new HeapSorter();
        Integer[] input = new Integer[]{9, 4, 11, 3, 5, 8, 0};
        sorter.sort(input);
        System.out.println(Arrays.asList(input));
    }

    private void sort(Integer[] input) {

        constructHeap(input);
        //first element now contains the biggest number
        //move it to last.

        int end = input.length - 1;

        while (end > 0) {
            //swap first element with last
            exchange(input, 0, end);
            bubbleDown(input, 0, end - 1);
            end--;
        }

    }

    /**
     * if root is i, the left child is 2i+1 and the righ child is 2i+2
     */
    private void constructHeap(Integer[] input) {
        //start with the last possible parent and go downwards
        // -1s are for working with 0 subscript array
        int start = input.length / 2 - 1;
        int end = input.length - 1;

        while (start >= 0) {
            // now that we have start and end, let's construct the heap
            bubbleDown(input, start, end);
            if (start == 0) {
                break;
            }
            start--;
        }
    }

    private void bubbleDown(Integer[] input, int start, int end) {
        int root = start;

        while (root * 2 + 1 <= end) // atleast one child exists
        {
            int positionToSwap = root; //just a convenient assignment.

            int lChild = root * 2 + 1;
            int rChild = root * 2 + 2;

            // find what is to be swapped with the root
            // the left child or the right child or none

            if (input[lChild] > input[root]) {
                positionToSwap = lChild;
            }

            if (rChild <= end && input[rChild] > input[positionToSwap]) {
                //override and make this rChild the new swap
                positionToSwap = rChild;
            }

            // if lChild or rChild is bigger, then do that swap
            if (positionToSwap != root) {
                exchange(input, root, positionToSwap);
            } else {
                return;
            }

        }
    }

    private void exchange(Integer[] input, int root, int positionToSwap) {
        int temp = input[root];
        input[root] = input[positionToSwap];
        input[positionToSwap] = temp;
    }


}
