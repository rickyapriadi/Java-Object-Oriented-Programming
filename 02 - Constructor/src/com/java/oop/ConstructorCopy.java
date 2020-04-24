package com.java.oop;

// example 1
class Copy {
    String web;

    public Copy(String web) {
        this.web = web;
    }

    // copy constructor : ini mengkopi nilai dari 1 object ke object lain.
    // object akan memanggil constructor ini
    public Copy(Copy copy) {
        web = copy.web;
    }
}

// example 2
class Addition {
    int i, j;

    // a normal constructor parameterized
    public Addition(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // copy constructor
    public Addition(Addition add) {
        i = add.i;
        j = add.j;
    }

    public void print(String string) {
        System.out.println(string + (i + j));
    }
}

// example 3 : error
class Error {
    int error;

    public Error(int error) {
        this.error = error;
    }

    // copy constructor not created here
}

public class ConstructorCopy {
    public static void main(String[] args) {

        // example 1
        Copy copy1 = new Copy("ricky.com");
        System.out.println("original : " + copy1.web);
        printAddress(copy1);

        // masukan object copy1 kedalam parameter copy constructor
        // ini akan memanggil copy constructor
        Copy copy2 = new Copy(copy1);
        System.out.println("copy     : " + copy2.web);
        printAddress(copy2);

        // example 2
        Addition addition1 = new Addition(10,5);
        addition1.print("\nparameterized constructor : ");
        printAddress(addition1);

        Addition addition2 = new Addition(addition1); // copy
        addition2.print("copy constructor called   : ");
        printAddress(addition2);

        Addition addition3 = addition2; // <-- not copy (same address)
        addition3.print("inline variable           : ");
        printAddress(addition3);

        // example 3
        Error error1 = new Error(5);
        System.out.println("\nerror : " + error1.error);

        // compiler error, copy constructor not created
//        Error error2 = new Error(error1);
    }

    static void printAddress(Object object) {
        int address = System.identityHashCode(object);
        System.out.println("address  : " + Integer.toHexString(address));
    }
}
