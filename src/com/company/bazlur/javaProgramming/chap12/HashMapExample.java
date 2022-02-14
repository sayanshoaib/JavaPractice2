package com.company.bazlur.javaProgramming.chap12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> citiesWithPopulation = new HashMap<>();

        citiesWithPopulation.put("Tokyo", 37_400_068);
        citiesWithPopulation.put("Delhi", 28_514_000);
        citiesWithPopulation.put("Dhaka", 19_578_000);
        citiesWithPopulation.put("New York", 8_601_186);
        citiesWithPopulation.put("Istanbul", 15_519_267);

        System.out.println(citiesWithPopulation);

        Integer population = citiesWithPopulation.get("Dhaka");
        System.out.println("Population of Dhaka: " + population);

        Set<String> keys = citiesWithPopulation.keySet();
        System.out.println("Keys: " + keys);

        Collection<Integer> values = citiesWithPopulation.values();
        System.out.println("Values = " + values);

        boolean dhakaExist = citiesWithPopulation.containsKey("Dhaka");
        System.out.println("Dhaka exists: " + dhakaExist);

        boolean containsValue = citiesWithPopulation.containsValue(1203030);
        System.out.println("Contains Value: " + containsValue);

        int totalCities = citiesWithPopulation.size();
        System.out.println("Total: " + totalCities);

    }
}
