package com.java.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

class TestVoid {

    // methods void
    public void inputInteger() {
        System.out.print("input number : ");
        try {
            int i = new Scanner(System.in).nextInt();
            this.print("input : " + i);
        } catch (InputMismatchException e) {
            this.print("wrong input!");
        }
    }

    public void getYesOrNo() {
        while (true) {
            System.out.print("y or n ? : ");
            String input = new Scanner(System.in).next();

            if (!input.equalsIgnoreCase("y") &&
                !input.equalsIgnoreCase("n")) {
                this.print("please input y/n");
            } else if (input.equalsIgnoreCase("n")) {
                this.print("input 'y' to continue");
            } else {
                this.print("getYesOrNo executed");
                break;
            }
        }
    }

    // methods void with param
    public void speed(int car, boolean bool) {
        int speed = (car > 0 && bool) ? car : 0;
        this.print("car speed : " + speed + " km/h");
    }

    public void print(String string) {
        System.out.println(string);
    }
}

public class MethodVoid {
    public static void main(String[] args) {

        TestVoid testVoid = new TestVoid();

        // invoke methods void
        testVoid.inputInteger();
        testVoid.getYesOrNo();

        // invoke methods void with param
        boolean bool = false;
        int speed = 0;
        try {
            System.out.print("speed car : ");
            speed = new Scanner(System.in).nextInt();
            bool = true;
        } catch (InputMismatchException e) {
            testVoid.print("wrong input");
        }

        testVoid.speed(speed,bool);

    }
}
