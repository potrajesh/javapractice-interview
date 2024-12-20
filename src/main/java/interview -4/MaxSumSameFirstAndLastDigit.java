import java.util.*;

public class MaxSumSameFirstAndLastDigit {
    public static void main(String[] args) {
        int[] A = {405, 45, 300, 300};

        int result = findMaxSumOfSameFirstAndLastDigit(A);

        System.out.println("The maximum sum of numbers with the same first and last digit is: " + result);
    }

    public static int findMaxSumOfSameFirstAndLastDigit(int[] numbers) {
        // Map to store the sum of numbers sharing the same first and last digits
        Map<String, Integer> digitGroupSums = new HashMap<>();

        for (int number : numbers) {
            String numberStr = String.valueOf(number); // Convert number to string
            char firstDigit = numberStr.charAt(0); // First digit
            char lastDigit = numberStr.charAt(numberStr.length() - 1); // Last digit

            // Create a key to group by first and last digits
            String key = firstDigit + "-" + lastDigit;

            // Add the current number to the group's sum
            digitGroupSums.put(key, digitGroupSums.getOrDefault(key, 0) + number);
        }

        // Find the maximum sum among all groups
        int maxSum = 0;
        for (int sum : digitGroupSums.values()) {
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
