/**
 *
 */

package com.algo.threads;

public class ThreadLocalTry extends Thread {

   private static ThreadLocal<Integer> number = new ThreadLocal<Integer>(){
       @Override
       protected Integer initialValue()
       {
           return new Integer(1);
       }
    };


   public void run()
   {
     for(int i=0;i<10;i++){
     System.out.println(Thread.currentThread().getName()+" : "+number.get());
         number.set(number.get()+1);
        }
     number.remove();
   }

   public static void main(String[] args)
   {
        ThreadLocalTry t1 = new ThreadLocalTry();
        Thread t2= new Thread(t1);
        Thread t3=new Thread(t1);
        Thread t4=new Thread(t1);

       t1.start(); t2.start(); t3.start(); t4.start();



   }
}
