package com.collections;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetCustomSortExample {
    public static void main(String[] args) {
        // TreeSet with custom comparator for descending order
        TreeSet<String> treeSet = new TreeSet<>(Comparator.reverseOrder());

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");

        System.out.println("TreeSet in descending order: " + treeSet);
        // Output: [Date, Cherry, Banana, Apple]
    }
}
