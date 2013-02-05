package com.algo.hanoi;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 2/10/12
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class TowerOfHanoi {

    public static void hanoi(int n, String source, String temp, String dest)
    {
       if(n==1)
       {
           System.out.println("Moving disc from "+source+" to "+dest);
       }
       else
       {
         // move n-1 discs to temp to get accces to n
           hanoi(n-1,source,dest,temp);
           //got access to n. move it.
           System.out.println("Moving disc from "+source+" to "+dest);
           //now source is empty. could by used as the temp.
         //move n-1 discs from temp
           hanoi(n-1,temp,source,dest);
       }

    }


  public static void main(String[] args)
  {
         TowerOfHanoi.hanoi(5,"Src","Aux","Dest");
  }
}
