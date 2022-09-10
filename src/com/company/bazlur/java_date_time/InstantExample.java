package com.company.bazlur.java_date_time;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant start = Instant.now();

        findPrimeNumber(100);

        Instant end = Instant.now();

        Duration elapsedTIme = Duration.between(start, end);
        long millis = elapsedTIme.toMillis();
        System.out.println("elapsedTime = " + millis);
    }

    private static void findPrimeNumber(int n) {
        BigInteger prime = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            prime = prime.nextProbablePrime();
        }

        System.out.println(n + "n'th prime number is: " + prime);
    }
}
