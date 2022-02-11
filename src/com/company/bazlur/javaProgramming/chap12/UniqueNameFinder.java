package com.company.bazlur.javaProgramming.chap12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class UniqueNameFinder {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/shoaib/Desktop/projects/names.txt");
        if (!Files.exists(path)) {
            throw new FileNotFoundException(path + " doesn't exist");
        }

        String textInFile = Files.readString(path);
        String[] names = textInFile.split(", ");

        Set<String> nameSet = new HashSet<>();
        for (String name : names) {
            nameSet.add(name);
        }

        System.out.println("Unique names: " + nameSet);
    }
}
