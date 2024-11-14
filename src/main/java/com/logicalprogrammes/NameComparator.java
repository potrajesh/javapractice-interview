package com.logicalprogrammes;

import java.util.*;

// Comparator class to compare Details objects by name
public class NameComparator implements Comparator<Details> {
    public int compare(Details d1, Details d2) {
        return d1.getName().compareTo(d2.getName());
    }
}

 class Test {
    public static void main(String[] args) {
        Details details = new Details();
        details.setName("r");
        Details details1 = new Details();
        details1.setName("a");
        Details details2 = new Details();
        details2.setName("j");

        List<Details> detailsList = new ArrayList<>();
        detailsList.add(details);
        detailsList.add(details1);
        detailsList.add(details2);

        // Sort the list using a new instance of NameComparator
        Collections.sort(detailsList, new NameComparator());

        // Display sorted list
        for (Details d : detailsList) {
            System.out.println(d.getName());
        }
    }
}
