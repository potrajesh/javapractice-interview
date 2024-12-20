import java.util.HashMap;
import java.util.Map;

public class FindTotalSumOfSameFirstAndLastDigit {
    public static void main(String[] args) {
        Integer numbers[] = {30, 909, 3190, 99, 3990, 9009};
    }

    public static int findTotalSumOfSameFirstAndLastDigit(Integer[] numbers) {
        // Map to store the sum of numbers sharing the same first and last digits
        Map<String, Integer> digitGroupSums = new HashMap<>();

        for (int number : numbers) {
            String numberStr = String.valueOf(number); // Convert number to string
            char firstDigit = numberStr.charAt(0); // First digit
            char lastDigit = numberStr.charAt(numberStr.length() - 1); // Last digit

            // Create a key to group numbers by first and last digits
            String key = firstDigit + "-" + lastDigit;

            // Add the current number to the group's sum
            digitGroupSums.put(key, digitGroupSums.getOrDefault(key, 0) + number);
        }

        // Calculate the total sum of all groups
        int totalSum = 0;
        for (int sum : digitGroupSums.values()) {
            totalSum += sum;
        }

        return totalSum;
    }
}
