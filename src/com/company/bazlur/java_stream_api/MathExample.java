package com.company.bazlur.java_stream_api;

import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        int a = 20;
        int b = -19;
        double x = 152.3;
        double y = 0.349;

        // absolute value
        System.out.println("|" + a + "| is " + Math.abs(a));
        System.out.println("|" + b + "| is " + Math.abs(b));
        System.out.println("|" + x + "| is " + Math.abs(x));
        System.out.println("|" + y + "| is " + Math.abs(y));

        // sqrt(x)
        int p = 2;
        System.out.println("The square root of " + p + " is " + Math.sqrt(p));

        // ROUNDING functions
        System.out.println(x + " is approximately " + Math.round(x));
        System.out.println(y + " is approximately " + Math.round(y));

        // The "ceiling" of a number
        System.out.println("The ceiling of " + a + " is " + Math.ceil(a));
        System.out.println("The ceiling of " + b + " is " + Math.ceil(b));
        System.out.println("The ceiling of " + x + " is " + Math.ceil(x));
        System.out.println("The ceiling of " + y + " is " + Math.ceil(y));

        // The "floor" of a number
        System.out.println("The floor of " + a + " is " + Math.floor(a));
        System.out.println("The floor of " + b + " is " + Math.floor(b));
        System.out.println("The floor of " + x + " is " + Math.floor(x));
        System.out.println("The floor of " + y + " is " + Math.floor(y));

        // Comparison operators
        // min
        System.out.println("min(" + a + ", " + b + ") is " + Math.min(a, b));
        System.out.println("min(" + x + ", " + y + ") is " + Math.min(x, y));
        System.out.println("min(" + a + ", " + x + ") is " + Math.min(a, x));
        System.out.println("min(" + y + ", " + b + ") is " + Math.min(y, b));

        // Max
        System.out.println("max(" + a + ", " + b + ") is " + Math.max(a, b));
        System.out.println("max(" + x + ", " + y + ") is " + Math.max(x, y));
        System.out.println("max(" + a + ", " + x + ") is " + Math.max(a, x));
        System.out.println("max(" + y + ", " + b + ") is " + Math.max(y, b));

        // PI & E
        System.out.println("Pi is " + Math.PI);
        System.out.println("e is " + Math.E);

        // Trigonometric operations
        // All arguments are given in radians
        // Convert a 45 degree angle to radians
        double angle = 45.0 * 2.0 * Math.PI / 360.0;
        System.out.println("cos(" + angle + ") is " + Math.cos(angle));
        System.out.println("sin(" + angle + ") is " + Math.sin(angle));

        // Inverse Trigonometric operations
        // All values are returned as radians
        double value = 0.707;
        System.out.println("acos(" + value + ") is " + Math.acos(value));
        System.out.println("asin(" + value + ") is " + Math.asin(value));
        System.out.println("atan(" + value + ") is " + Math.atan(value));

        // Exponential and Logarithmic
        // exp(a)
        System.out.println("exp(1.0) is " + Math.exp(1.0));
        System.out.println("exp(10.0) is " + Math.exp(10.0));
        System.out.println("exp(0.0) is " + Math.exp(0.0));

        // log(a)
        System.out.println("log(1.0) is " + Math.log(1.0));
        System.out.println("log(10.0) is " + Math.log(10.0));
        System.out.println("log(Math.E) is " + Math.log(Math.E));

        // pow(x, y)
        System.out.println("pow(2.0, 2.0) is " + Math.pow(2.0, 2.0));
        System.out.println("pow(10.0, 4) is " + Math.pow(10.0, 4));
        System.out.println("pow(8, -1) is " + Math.pow(8, -1));

        Random random = new Random();
        int aRandomNumber = random.nextInt();
        System.out.println(aRandomNumber);

        int maxInt = 2_147_483_647;
        int overflow = maxInt + 1;
        System.out.println(overflow);
    }
}
