import java.util.*;
import java.util.stream.Collectors;

class MaxSumSameFirstLastDigits {

    public static int maxSum(int[] A) {
        // Group numbers by their first and last digits
        Map<String, List<Integer>> digitGroups = Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(maxSumSameFirstLastDigits::getFirstAndLastDigits));

        // Calculate the maximum sum for valid groups
        return digitGroups.values().stream()
                .filter(group -> group.size() > 1) // Only consider groups with at least two numbers
                .map(group -> {
                    // Sort the group in descending order and sum the top two
                    group.sort(Comparator.reverseOrder());
                    return group.get(0) + group.get(1);
                })
                .max(Comparator.naturalOrder()) // Find the maximum sum
                .orElse(-1); // Return -1 if no valid groups are found
    }

    // Helper function to extract the first and last digits of a number
    private static String getFirstAndLastDigits(int num) {
        String numStr = String.valueOf(num);
        return numStr.charAt(0) + "" + numStr.charAt(numStr.length() - 1);
    }

    public static void main(String[] args) {
        // Example Test Cases
        int[] A1 = {130, 191, 10, 200};
        int[] A2 = {405, 45, 300, 300};
        int[] A3 = {30, 909, 3190, 99, 3990, 9009};

        System.out.println(maxSum(A1)); // Output: 140
        System.out.println(maxSum(A2)); // Output: 600
        System.out.println(maxSum(A3)); // Output: 9918
    }
}