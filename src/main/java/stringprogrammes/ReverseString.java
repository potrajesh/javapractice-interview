package stringprogrammes;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("enter first string");
        String firstString = s.nextLine();
        System.out.println("enter second string");
        String second = s.nextLine();
        for (int i = firstString.length() - 1, j = second.length() - 1; j >= 0; i--, j--) {
            if(firstString.charAt(i)==second.charAt(i)){
                count++;
            }
            if (count == second.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
