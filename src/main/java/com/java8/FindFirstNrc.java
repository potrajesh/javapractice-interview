package com.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNrc {

    public static void main(String[] args) {
        String s ="comparator";
        // Count occurrences of each character
        Map<Character, Long> characterCount = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterCount);
        // Find the first character with a count of 1
        Character first = s.chars().mapToObj(c -> (char) c).filter(c -> characterCount.get(c) == 1).findFirst().get();
         System.out.println(first);
    }
}
