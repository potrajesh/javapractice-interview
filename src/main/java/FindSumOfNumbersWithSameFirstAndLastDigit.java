
/*Q)findSumOfNumbersWithSameFirstAndLastDigit
A) Given A = [130, 191, 10, 200], the function should return 140.
The only integers in A that share first and last digits are 130 and 10.//
*/
public class FindSumOfNumbersWithSameFirstAndLastDigit{
    public static int findSumOfNumbersWithSameFirstAndLastDigit(Integer[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            String numberStr = String.valueOf(number); // Convert the number to a string
            int firstDigit = Character.getNumericValue(numberStr.charAt(0)); // First digit
            int lastDigit = Character.getNumericValue(numberStr.charAt(numberStr.length() - 1)); // Last digit

            if (firstDigit == lastDigit) {
                sum += number; // Add to sum if first and last digits match
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Integer numbers[] = {130, 191, 10, 200};
        findSumOfNumbersWithSameFirstAndLastDigit(numbers);
    }
}