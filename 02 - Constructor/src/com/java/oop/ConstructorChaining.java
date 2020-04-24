package com.java.oop;

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

public class ConstructorChaining {
    public static void main(String[] args) {

        // example 1
        new Mahasiswa();
        new Mahasiswa("wulan");
        new Mahasiswa("devric",1000);
        new Mahasiswa("galang",2000,"perteknikan");

        // example 2
        new Chain("ricky", 20);
        new Chain(400);
        new Chain();

    }
}
