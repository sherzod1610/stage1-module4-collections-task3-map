package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        // Split the sentence into words using whitespace as the delimiter
        String[] words = sentence.toLowerCase().split("\\s+");

        // Count the repetitions of each word
        for (String word : words) {
            // Remove any punctuation marks or special characters from the word
            word = word.replaceAll("[^a-zA-Z]", "");

            // Ignore empty words
            if (word.isEmpty()) {
                continue;
            }

            // Update the word repetition count in the map
            int count = wordRepetitionMap.getOrDefault(word, 0);
            wordRepetitionMap.put(word, count + 1);
        }

        return wordRepetitionMap;
    }
}
