package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Map2Test_gishe {
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> wordLengthMap = new HashMap<>();
        for (String s : strings) {
            wordLengthMap.put(s, s.length());
        }
        return wordLengthMap;
    }
    // provide assertions for the above method
    @Test
    void wordLen() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        Map<String, Integer> map2 = Map2.wordLen_Akoi(map);
        assertEquals(map2.get("a"), "b");
        assertEquals(map2.get("b"), "b");
    }


}