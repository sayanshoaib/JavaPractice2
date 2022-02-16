package com.company.bazlur.javaProgramming.chap12;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class DuplicateFileFinderDemo {
    public static void main(String[] args) throws IOException {
        DuplicateFileFinder finder = new DuplicateFileFinder();

        Map<String, List<Path>> dupFiles = finder.findDuplicate(Path.of("/Users/shoaib/Desktop/projects"));

        System.out.println("Duplicate files: ");
        Collection<List<Path>> values = dupFiles.values();
        for (List<Path> value : values) {
            System.out.println(value);
        }
    }
}
