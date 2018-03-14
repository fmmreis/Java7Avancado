package org.ottolini.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static void main(String[] args) {

        Map<Integer, String> genMap = new HashMap<>();

        genMap.put(5, "Cinco");
        genMap.put(2, "Dois");
        genMap.put(4, "Quatro");
        genMap.put(3, "Três");

        genMap.put(1, "Um");

        for(Integer i : genMap.keySet()) {
            System.out.println(i + " / " + genMap.get(i));
        }
    }
}
