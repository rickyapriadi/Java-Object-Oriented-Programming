package com.java.oop;

/** ‘this’ keyword to return the current class instance */

class A {
    int i;
    int j;

    public A() {
        i = 5;
        j = 10;
    }

    A get() {
        return this;
    }

    public void display() {
        System.out.println(i + j);
    }
}

public class EThisReturnInstance {
    public static void main(String[] args) {

        A a = new A();
        a.get().display();

    }
}
