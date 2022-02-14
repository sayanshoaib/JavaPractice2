package com.company.bazlur.javaProgramming.chap12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TopFrequentWordFinder {
    public String findTopWord(String path) throws IOException {
        Path essay = Path.of("/Users/shoaib/Desktop/projects/essay.txt");
        if (!Files.exists(essay)) {
            throw new FileNotFoundException(essay + " doesn't exist");
        }

        String textInFile = Files.readString(essay);
        String[] words = textInFile.split("[\\p{Punct}\\s]+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            if (wordFrequencyMap.containsKey(word)) {
                Integer count = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, count + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }

        int maxCount = 0;
        String topWord = "";

        Set<Map.Entry<String, Integer>> entries = wordFrequencyMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
                topWord = key;
            }
        }

        return topWord;
    }
}
