package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = sourceMap.keySet();
        for (Integer i : set) {
            if (map.containsKey(sourceMap.get(i))) {
                int repeatedKeyValue = map.get(sourceMap.get(i));
                if (repeatedKeyValue < i) {
                    map.put(sourceMap.get(i), i);
                }
            } else {
                map.put(sourceMap.get(i), i);
            }
        }
        return map;
    }
}
