package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FIndFirstRepeatedChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));  // Expected output: 'l'
        System.out.println(firstNonRepeatingChar("loveleetcode"));  // Expected output: 'v'
        System.out.println(firstNonRepeatingChar("aabbcc"));  // Expected output: null
        System.out.println(firstNonRepeatingChar(""));
    }

    private static Character firstNonRepeatingChar(String leetcode) {
        HashMap<Character, Integer> mapData = new HashMap<>();
        for (char c : leetcode.toCharArray()) {
            if (mapData.containsKey(c)) {
                mapData.put(c, mapData.get(c) + 1);
            } else {
                mapData.put(c, 1);
            }
        }
        Character result = null;
        for (Character c : leetcode.toCharArray()) {
            if (mapData.get(c) == 1) {
                return c;
            }
        }
        return result;
    }
}
