package com.java.oop;

/** "this" keyword as method parameter*/

// example 1
class Parameter {
    String name;
    int NIM;

    public Parameter(String name, int NIM) {
        this.name = name;
        this.NIM  = NIM;
    }

    private void display(Parameter obj) {
        System.out.println("nama : " + this.name);
        System.out.println("NIM  : " + this.NIM);
    }

    public void get() {
        display(this); // "this" as method parameter
    }
}

// example 2
class Test {
    String name;

    public Test() {
        name = "ricky";

        System.out.println("\nbefore calling display()");
        System.out.println("nama : " + name);

        display(this); // "this" as method parameter

        System.out.println("after calling display()");
        System.out.println("nama : " + name);
    }

    private void display(Test test) {
        name = "bambang";
    }
}

public class DThisMethodParameter {
    public static void main(String[] args) {

        // example 1
        Parameter parameter = new Parameter("ricky",20201234);
        parameter.get();

        // example 2
        new Test();
        
    }
}
