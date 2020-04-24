package com.java.oop;

/**
 *  Constructor = method (special method) yg pertama kali dipanggil saat object dibuat
 *  Constructor dibagi menjadi 3 : 1 - default constructor
 *                                 2 - no-arg constructor
 *                                 3 - parameterized constructor
 */

class A {
    // default constructor, kita tidak membuat constructor
    // tetapi compiler akan menulis otomatis di dalam file .class
}

class B {
    // no-arg constructor = constructor tanpa parameter
    public B() {
        System.out.println("No-arg constructor");
    }
}

class C {
    // parameterized constructor
    public C(String c) {
        System.out.println(c);
    }
}

public class Constructor {
    public static void main(String[] args) {

        // default constructor
        new A();

        // no-arg constructor
        new B();

        // Parameterized constructor
        new C("Parameterized constructor");

    }
}
