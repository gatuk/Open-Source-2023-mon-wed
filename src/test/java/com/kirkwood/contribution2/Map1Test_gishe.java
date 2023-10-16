package com.kirkwood.contribution2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_gishe {
    @Test
    void Map1Test_gishe() {
        Map<String, String> map = new HashMap<>();
        map.put("potato", "ketchup");
        Map<String, String> map1 = Map1.mapBullyH_Akoi(map);
        assertEquals("ketchup", map1.get("potato"));
        assertEquals("ketchup", map1.get("fries"));
        // Additional code here
    }

}