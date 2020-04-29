package com.java.oop;

// example 1
class Mahasiswa {
    String name;
    int NIM;
    String majors;

    // default constructor
    public Mahasiswa() {
        // invoke constructor 1 parameter
        this("ricky");
    }

    // constructor 1 parameter
    public Mahasiswa(String name) {
        // invoke constructor 2 parameter
        this(name, 2014220038);
    }

    // constructor 2 parameter
    public Mahasiswa(String name, int NIM) {
        // invoke constructor 3 parameter
        this(name,NIM,"teknik");
    }

    // constructor 3 parameter
    public Mahasiswa(String name, int NIM, String majors) {
        this.name = name;
        this.NIM = NIM;
        this.majors = majors;

        // invoke print() method
        this.print();
    }

    public void print() {
        System.out.println("\nname   : " + this.name);
        System.out.println("NIM    : " + this.NIM);
        System.out.println("majors : " + this.majors);
    }
}

// example 2
class Chain {

    public Chain() {
        System.out.println("\ndefault constructor");
    }

    public Chain(int i) {
        this();
        System.out.println("constructor 1 param : " + i);
    }

    public Chain(String str, int i) {
        this(10);
        System.out.println("constructor 2 param : " + str + " : " + i);
    }
}

// example 3
class E {
    int age;

    public E() {
        this.age = 10;
    }

    public E(int e) {
        this();
        this.age += e;
    }

    public E(int e, int f) {
        this(e);
        this.age += (e * f);
    }

    public E(int e, int f, int g) {
        this(e,f);
        this.age += (e + f + g);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        // example 1
        new Mahasiswa();
        new Mahasiswa("wulan");
        new Mahasiswa("devric",1000);
        new Mahasiswa("galang",2000,"perteknikan");

        // example 2
        new Chain("ricky", 20);
        new Chain(40);
        new Chain();

        // example 3
        E e;

        e = new E();
        System.out.println("default constructor     : " + e.age); // 10

        e = new E(3);
        System.out.println("constructor 1 parameter : " + e.age); // 13

        e = new E(4,4);
        System.out.println("constructor 2 parameter : " + e.age); // 30

        e = new E(5,5, 5);
        System.out.println("constructor 3 parameter : " + e.age); // 55
    }
}
