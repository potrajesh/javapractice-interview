package com.maps;

public class FindHighestNumber {

    public static void main(String[] args) {
        Integer[] arr = {2,1,13,3,5};
        int max = arr[0];
        for (int a:arr){
            if(max<a){
                 max = a;
            }
        }
        System.out.println(max);
    }
}
