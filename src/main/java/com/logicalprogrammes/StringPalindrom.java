package com.logicalprogrammes;

public class StringPalindrom {
    public static void main(String[] args) {

        String s = "aba";

        int start = 0;
        int end = s.length() - 1;
        boolean palindrome = true;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                palindrome = false;
                break;
            } else {
                System.out.println(" palindrom");
            }
            start++;
            end--;
        }

    }
}
