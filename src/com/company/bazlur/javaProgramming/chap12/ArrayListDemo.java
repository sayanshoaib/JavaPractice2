package com.company.bazlur.javaProgramming.chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> topCities = new ArrayList<>();

        topCities.add("London");
        topCities.add("New york");
        topCities.add("Paris");
        topCities.add("Moscow");
        topCities.add("Tokyo");
        topCities.add("Dubai");
        topCities.add("Barcelona");

        System.out.println("Top Cities: ");
        System.out.println(topCities);

        int totalCities = topCities.size();
        System.out.println("total cities: " + totalCities);

        String secondCity = topCities.get(1);
        System.out.println("second City: " + secondCity);

        topCities.set(1, "Toronto");
        System.out.println(topCities);
        System.out.println(secondCity);

        topCities.remove(2);
        System.out.println(topCities);

        boolean isTokyoAdded = topCities.contains("Tokyo");
        System.out.println(isTokyoAdded);

        int firstIndexTokyo = topCities.indexOf("Tokyo");
        System.out.println(firstIndexTokyo);

        int lastIndexOfTokyo = topCities.lastIndexOf("Tokyo");
        System.out.println(lastIndexOfTokyo);
    }
}
