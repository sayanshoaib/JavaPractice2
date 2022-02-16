package com.company.kunalKushwaha.OOP.oop2;

import jdk.dynalink.beans.StaticClass;

public class staticBlock {
    static int a = 4;
    static int b;

    // will only run once
    static {
        System.out.println("I'm in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticBlock onj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
        obj2.b += 2;
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }

}
