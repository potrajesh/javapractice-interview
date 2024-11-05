package com.collections;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("test");
        hs.add("test");
        hs.add("test1");

        System.out.println(hs.size());

        System.out.println(hs);


    }
}
