package com.company.kunalKushwaha.DSAbootcamp.Lecture20;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Shoaib Hasan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));
        System.out.println("      sooooo    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
