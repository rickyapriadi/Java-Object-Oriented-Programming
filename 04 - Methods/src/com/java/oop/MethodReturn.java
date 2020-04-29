package com.java.oop;

class TestReturn {
    int i;

    // method return value
    public int sum() {
        return i + 5;
    }

    // method return value with param
    public int square1(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = i * i;
        }
        return result;
    }

    public int square2(int i) {
        return i * i;
    }

    public int maxValue(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

    public int multiplyInteger(int i, int j) {
        return i * j;
    }

    public void print(String string) {
        System.out.println(string);
    }
}

public class MethodReturn {
    public static void main(String[] args) {

        TestReturn testReturn = new TestReturn();
        int result;

        result = testReturn.sum();
        testReturn.print("sum       : " + result); // 5

        result = testReturn.square1(5);
        testReturn.print("square 1  : " + result); // 25

        result = testReturn.square2(5);
        testReturn.print("square 2  : " + result); // 25

        result = testReturn.maxValue(5,10);
        testReturn.print("max value : " + result); // 10

        // multiplyInteger
        result = testReturn.multiplyInteger(4,5);
        testReturn.print("4 x 5 = " + result);
        testReturn.print("4 x 5 = " + testReturn.multiplyInteger(4,5));
        System.out.println("4 x 5 = " + testReturn.multiplyInteger(4,5));

    }
}
