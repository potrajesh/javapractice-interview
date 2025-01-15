package ninzas.Stringpractice;

public class PalindromicSubstrings {

    public static int countPalindromicSubstrings(String str) {
        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += expandAroundCenter(str, i, i);       // Odd-length palindromes
            count += expandAroundCenter(str, i, i + 1);   // Even-length palindromes
        }

        return count;
    }

    private static int expandAroundCenter(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            System.out.println(str.substring(left, right + 1));
            count++;
           left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abba";
        System.out.println(countPalindromicSubstrings(str));  // Output: 6
    }
}
