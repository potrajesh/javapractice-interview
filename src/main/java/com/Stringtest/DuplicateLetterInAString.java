package com.Stringtest;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateLetterInAString {

    public static void main(String[] args) {

        String s = "india is the best country";

        //old logic we get on2 problem so we go hashset
         /*for (int i=0;i<s.length()-1;i++){
             for (int j=0;j<i;j++){
               if(s.charAt(i)==s.charAt(j)){
                   System.out.print(s.charAt(j));
               }
             }
         }*/
        //by using collections
        /*HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> foundDuplicates = new HashSet<>();

        for (int i=0;i<s.length()-1;i++) {
            char c = s.charAt(i);
            if (duplicates.contains(c)) {
                foundDuplicates.add(c);
            }
            else{
                duplicates.add(c);
            }
        }
        System.out.print(foundDuplicates);*/

      //without collections
       int [] arr =  new int[256];//ascii
        for (int i=0;i<s.length()-1;i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > 1) {
                System.out.print((char)i);
            }
        }
    }
}
