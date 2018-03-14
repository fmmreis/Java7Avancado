package org.ottolini.generics;

import java.util.*;

public class GenericSet {

    public static void main(String[] args) {
        Set<String> genSet = new HashSet<>();

        genSet.add("ZZZ");
        genSet.add("CCC");
        genSet.add("AAA");
        genSet.add("BBB");

        ArrayList<String> arrList = new ArrayList<>(genSet);
        Collections.sort(arrList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        for(String s : genSet){
            System.out.println(s);
        }

        System.out.println("----------------------");

        for(String s : arrList){
            System.out.println(s);
        }
    }
}
