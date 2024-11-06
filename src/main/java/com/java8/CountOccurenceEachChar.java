package com.java8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceEachChar {


    public static void main(String[] args) {
        String name = "Giri is a Java developer ";

        // count occurence each character given string
        Map<Character,Long> map =name.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println("count occurence each character given string"+map);
        // {p=1, a=2, r=1, D=1, e=3, v=2, J=1, l=1, o=1}

        // find the print duplicate given string
        List<Character> characterList =name.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream()
                .filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("print duplicate given string"+characterList);
        // [a, e, v]

        // find the unique character given string
        List<Character> character =name.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream()
                .filter(entry->entry.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("find the unique char"+character);// [p, r, D, J, l, o]

        // find the vowels given string
        List<Character> vowels =name.chars().mapToObj(c-> (char)c).filter(c->"aeiouAEIOU"
                .indexOf(c)!=-1).collect(Collectors.toList());
        vowels.forEach(System.out::print);
        //iiiaaaeeoe
    }
}
