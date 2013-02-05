package com.algo.scrap;

class Uber {
    static int y=2;
    Uber(int x) {
         y=y*2; }
    Uber() { System.out.print("Hey");
        y++; }
}

class Minor extends Uber {
    Minor() { super(y);
        y=y+3; }

    public static void main(String[] args) {
        new Minor();
        System.out.println(y);
    }
}

