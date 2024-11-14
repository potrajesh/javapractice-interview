package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(null);
        list.add(null);
        list.add("World");
        System.out.println(list);
    }
}
