package interviewtest;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 2, 7, 8};

        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("Duplicates in the array:");

        for (int num : arr) {
            if (!seen.add(num)) {  // if add() returns false, it means the number is a duplicate
                System.out.println(num);
            }
        }
    }
}
