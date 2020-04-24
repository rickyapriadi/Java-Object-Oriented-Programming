package com.java.oop;

/** "this" keyword untuk memanggil constructor lain di class yg sama */

class Constructor {
    String name;
    int NIM;

    public Constructor() {
        this("ricky", 2020);
        System.out.println("\ndefault constructor");
    }

    public Constructor(String name, int NIM) {
        this.name = name;
        this.NIM  = NIM;

        System.out.println("\nparameterized constructor");
        System.out.println("nama : " + this.name);
        System.out.println("NIM  : " + this.NIM);
    }
}

public class BThisConstructor {
    public static void main(String[] args) {

        new Constructor();

    }
}
