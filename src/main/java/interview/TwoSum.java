package interview;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));  // Output: [0, 1]
     //   System.out.println(java.util.Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));       // Output: [1, 2]
       // System.out.println(java.util.Arrays.toString(twoSum(new int[]{3, 3}, 6)));         // Output: [0, 1]
        //System.out.println(java.util.Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));// Output: []
        //System.out.println(java.util.Arrays.toString(twoSum(new int[]{}, 0)));
    }

    private static int[] twoSum(int[] input, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i
                };
            }
            map.put(input[i], i);
        }
        return new int[]{}; // No solution found
    }
}
