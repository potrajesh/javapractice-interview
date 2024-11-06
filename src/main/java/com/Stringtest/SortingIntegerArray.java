package com.Stringtest;

import java.util.Arrays;

public class SortingIntegerArray {
    public static void main(String[] args) {

        Integer arr[] = {0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

}