package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        StringBuilder newSentence = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (!(sentence.charAt(i) != ',' || sentence.charAt(i) != '.' || sentence.charAt(i) != '?'
                    || sentence.charAt(i) != '!')) {
                newSentence.append(sentence.charAt(i));
            }
        }
        String[] strings = newSentence.toString().toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }
}
