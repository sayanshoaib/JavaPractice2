package com.company.bazlur.javaProgramming.chap12;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunctionDemo {
    public static void main(String[] args) {
        Path path = Path.of("/Users/shoaib/Desktop/projects/output.txt");
        String hash = hash(path);
        System.out.println("hash = " + hash);
    }

    private static String hash(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);

            return new BigInteger(1, digest).toString(16);
        } catch (NoSuchAlgorithmException | IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
