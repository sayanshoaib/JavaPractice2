package com.company.bazlur.javaProgramming.chap12;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<String> topCities = new Vector<>();

        topCities.add("London");
        topCities.add("New york");
        topCities.add("Paris");
        topCities.add("Moscow");
        topCities.add("Tokyo");
        topCities.add("Dubai");
        topCities.add("Barcelona");

        System.out.println("Top Cities: ");
        System.out.println(topCities);
    }
}
