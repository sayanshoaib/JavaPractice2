package com.company.bazlur.javaProgramming.chap12;

import java.io.IOException;

public class TopFrequentWordFinderDemo {
    public static void main(String[] args) throws IOException {
        TopFrequentWordFinder finder = new TopFrequentWordFinder();
        String topWord = finder.findTopWord("/Users/shoaib/Desktop/projects/essay.txt");
        System.out.println("topWord = " + topWord);
    }
}
