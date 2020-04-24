package com.java.oop;

/** "this" keyword untuk merujuk pada variable di class saat ini*/

class Variable {
    String name;
    int NIM;

    // parameterized constructor
    public Variable(String name, int NIM) {
        this.name = name;
        this.NIM  = NIM;
    }

    public void print() {
        System.out.println("nama : " + this.name);
        System.out.println("NIM  : " + this.NIM);
    }
}

public class AInstanceVariables {
    public static void main(String[] args) {

        Variable variable = new Variable("ricky", 2020);

        variable.print();

    }
}
