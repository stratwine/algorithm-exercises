package com.algo.bit;

/*
http://www.catonmat.net/blog/low-level-bit-hacks-you-absolutely-must-know/
 */
public class BitCalculations {

    public static void main(String[] args) {

        evenOrOdd(293);

    }

    private static void evenOrOdd(int i) {
      if((i&1)==1){
          System.out.println("odd");
      }
      else
      {
          System.out.println("even");
      }

    }
}
