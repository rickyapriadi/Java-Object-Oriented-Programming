package com.java.oop;

class E {
    int age;

    // default constructor
    public E() {
        this.age = 10;
    }

    // constructor 1 parameter
    public E(int e) {
        this();
        this.age += e;
    }

    // constructor 2 parameter
    public E(int e, int f) {
        this(e);
        this.age += (e * f);
    }

    // constructor 3 parameter
    public E(int e, int f, int g) {
        this(e,f);
        this.age += (e + f + g);
    }
}

public class ConstructorChaining2 {
    public static void main(String[] args) {

        E e;

        // default constructor
        e = new E();
        System.out.println("default constructor     : " + e.age); // 10

        // constructor 1 parameter invoke default constructor
        e = new E(3);
        System.out.println("constructor 1 parameter : " + e.age); // 13

        // constructor 2 parameter invoke
        // constructor 1 parameter and constructor default
        e = new E(4,4);
        System.out.println("constructor 2 parameter : " + e.age); // 30

        // constructor 3 parameter invoke
        // constructor 2 parameter and constructor default
        e = new E(5,5, 5);
        System.out.println("constructor 3 parameter : " + e.age); // 55

    }
}
