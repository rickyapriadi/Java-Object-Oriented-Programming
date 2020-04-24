package com.java.oop;

/**
 *  Constructor Overloading :
 *  - sebuah class yg memiliki lebih dari satu constructor
 *    dengan parameter yang berbeda.
 *  - constructor bisa memiliki berapapun jumlah parameter yg kita inginkan
 *    seperti hal nya dengan method overloading.
 */

class D {
    int d;
    int e;

    // default constructor
    public D() {
        this.d = 10;
        System.out.println("no-arg constructor      : " + d);
    }

    // constructor 1 parameter
    public D(int d) {
        this.d = d;
        System.out.println("constructor 1 parameter : " + this.d);
    }

    // constructor 2 parameter
    public D(int d, int e) {
        this.d = d;
        this.e = e;
        System.out.println("constructor 2 parameter : " + (this.d + this.e));
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        new D();
        new D(15);
        new D(10,10);

    }
}
