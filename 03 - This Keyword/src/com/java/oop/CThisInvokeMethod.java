package com.java.oop;

/** "this" keyword to invoke current class method */

// example 1
class Method {

    public void display() {
        this.get(); // invoke get() function
        System.out.println("inside display function");
    }

    private void get() {
        System.out.println("\ninside get function");
    }
}

// example 2
class Testing {
    int i;

    public Testing() {
        i = 5;
        this.display(i); // invoke display() function
    }

    private void display(int i) {
        this.i = i;
        this.get(); // invoke get() function
        System.out.println("inside display function : " + i); //  i != this.i
    }

    private void get() {
        this.i += 5;
        System.out.println("\ninside get function : " + this.i); //  10
    }
}

class CThisInvokeMethod {
    public static void main(String[] args) {

        // example 1
        Method method = new Method();
        method.display();

        // example 2
        new Testing(); // invoke constructor

    }
}
