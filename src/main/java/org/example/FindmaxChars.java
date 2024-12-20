package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindmaxChars {
    public static void main(String[] args) {
        List<String> maxCharsList = Arrays.asList("bank", "account", "customer");
        String s = maxCharsList.stream().max(Comparator.comparing(i -> i)).get();
        System.out.println(s);

    }
}
