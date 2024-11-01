package com.maps;

import java.util.HashMap;

public class CountUsingMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = {"hyd", "vja", "hyd"};
        for (String d : arr) {
            if(map.containsKey(d)){
                map.put(d,map.get(d)+1);
            }
            else{
                map.put(d,1);
            }
        }
        System.out.println(map.entrySet());
    }
}
