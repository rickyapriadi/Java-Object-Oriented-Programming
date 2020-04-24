package com.java.oop;

// class
class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }
    void display() {
        System.out.println("Lamp is on : " + isOn);
    }
}

public class Lampu {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(); // object
        Lamp lamp2 = new Lamp(); // object

        lamp1.turnOn();
        lamp2.turnOff();

        lamp1.display();
        lamp2.display();

    }
}
