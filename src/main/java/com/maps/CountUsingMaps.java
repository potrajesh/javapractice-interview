package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountUsingMaps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = { "hyd", "hyd", "viz", "ant", "ant","ant" };
        for (String d : arr) {
            if(map.containsKey(d)){
                map.put(d,map.get(d)+1);
            }
            else{
                map.put(d,1);
            }
        }
        //get highest
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Map.Entry<String,Integer> max = null;
        for (Map.Entry<String,Integer> e : entries){
            if(max==null||e.getValue()>max.getValue()){
                max = e;
            }
        }
        System.out.println(max);

    }
}
