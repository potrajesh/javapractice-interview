public class FIndSumOfPairs {
    //1. Given A = [130, 191, 10, 200], the function should return 140.
// The only integers in A that share first and last digits are 130 and 10.//maxsum
    public static void main(String[] args) {
        Integer[] numbers = {130, 191, 10, 200};
        for (int number : numbers) {
            String s = String.valueOf(number);
            int firstDigit = Character.getNumericValue(s.charAt(0));
            int lastDigit = Character.getNumericValue(s.charAt(s.length() - 1));
            System.out.println("Number: " + number + " -> First and Last Digit: " + firstDigit + lastDigit);

        }

        // Print the number and its first-last digit combination

    }
}