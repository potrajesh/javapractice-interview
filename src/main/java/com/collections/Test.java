package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Set set = new HashSet<>();

        set.add(1);

        set.add(1);

        set.add(3);

        set.add(4);

        set.add(5);

        set.add(6);

        set.forEach(s -> System.out.println(s));

    }

}