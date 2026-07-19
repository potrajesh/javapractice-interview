package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeatedCharacter {
    public static void main(String[] args) {
        String name = "hellorajesh";
        // Find the 2nd non-repeated character
        Character result = findSecondNonRepeatedCharacter(name);
        if (result != null) {
            System.out.println("The 2nd non-repeated character is: " + result);
        } else {
            System.out.println("No 2nd non-repeated character found.");
        }
    }
    public static Character findSecondNonRepeatedCharacter(String str) {
        // Create a LinkedHashMap to count character frequencies while maintaining insertion order
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c) // Convert int stream to char stream
                .collect(Collectors.groupingBy(
                        Function.identity(), // Group by the character itself
                        LinkedHashMap::new,  // Maintain insertion order
                        Collectors.counting() // Count occurrences of each character
                ));

        // Filter characters with frequency = 1 and get the 2nd one
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1) // Only non-repeated characters
                .map(Map.Entry::getKey) // Get the character
                .skip(1) // Skip the first non-repeated character
                .findFirst() // Get the second non-repeated character
                .orElse(null); // Return null if not found
    }
}
