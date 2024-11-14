package com.logicalprogrammes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMap {

    public static void main(String[] args) {

        Set<Map.Entry<Integer, String>> entries = SortHashMap.asMap().entrySet();
        List<Map.Entry<Integer, String>> entries1 = new ArrayList<>(entries);
        Collections.sort(entries1,new Comparator<Map.Entry<Integer, String>>(){
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(entries1);
        List<Map.Entry<Integer, String>> collect = entries.stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println("java8 -->"+collect);

    }
    public static Map<Integer, String> asMap() {
        Map<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "d");
        integerStringHashMap.put(3, "a");
        integerStringHashMap.put(12, "z");
        integerStringHashMap.put(2, "v");

        return integerStringHashMap;
    }
}
