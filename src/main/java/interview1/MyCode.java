package interview1;

import java.util.*;
import java.util.stream.Collectors;

class MyCode {
    public static void main(String args[]) {
        String[][] scores = { 
            { "Manisha", "14" }, 
            { "Sachin", "12" }, 
            { "Ram", "16" }, 
            { "Sachin", "18" } 
        };

        // Step 1: Group by name and calculate sum and count
        Map<String, double[]> scoreMap = Arrays.stream(scores)
            .collect(Collectors.groupingBy(
                entry -> entry[0],
                Collectors.collectingAndThen(Collectors.toList(), list -> new double[]{
                    list.stream().mapToDouble(e -> Double.parseDouble(e[1])).sum(),
                    list.size()
                })
            ));

        // Step 2: Find the name with the highest average score
        Map.Entry<String, Double> highestAvg = scoreMap.entrySet()
            .stream()
            .map(entry -> Map.entry(
                entry.getKey(), 
                entry.getValue()[0] / entry.getValue()[1] // Calculate average
            ))
            .max(Map.Entry.comparingByValue())
            .orElseThrow(() -> new RuntimeException("No scores available"));

        // Step 3: Print result
        System.out.println("Name: " + highestAvg.getKey());
        System.out.println("Highest Average Score: " + highestAvg.getValue());
    }
}
