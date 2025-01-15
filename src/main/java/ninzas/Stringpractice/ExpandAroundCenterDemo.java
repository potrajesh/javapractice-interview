package ninzas.Stringpractice;

public class ExpandAroundCenterDemo {

    public static void expandAroundCenter(String str, int left, int right) {
        System.out.println("Expanding around center:");
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            System.out.println("Palindrome: " + str.substring(left, right));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String str = "abcba";
        int center = 2;  // Center at 'c'
        
        // For odd-length palindromes
        expandAroundCenter(str, center, center);

        // For even-length palindromes (this example won't find any for this string)
       // expandAroundCenter(str, center, center + 1);
    }
}
