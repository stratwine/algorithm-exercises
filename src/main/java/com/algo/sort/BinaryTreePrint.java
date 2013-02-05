package com.algo.sort;

public class BinaryTreePrint {

    public static void main(String[] args) {
        Integer[] input = new Integer[]{1, 4, 6, 5, 3, 7, 5, 11};
        printTree(input);
    }

    private static void printTree(Integer[] input) {

        int root = 0;
        for (int i = 0; i < input.length - 1; i = (2 * i) + 3) {
            if (i < input.length) {
                System.out.print(input[i]);
            }
            if (((2 * i) + 1) < input.length) {
                System.out.print(input[(2 * i) + 1]);
            }
            if ((2 * i + 2) < input.length) {
                System.out.print(input[(2 * i) + 2]);
            }
        }
    }
}
