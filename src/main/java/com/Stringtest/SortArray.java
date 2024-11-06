package com.Stringtest;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        String data[] ={"tsd","adfs","qerewr"};

        for(int i=0;i< data.length-1;i++){
           for (int j=i+1;j< data.length-1;j++){
              if(data[i].compareTo(data[j])>0){
                    String temp =data[i];
                    data[i]=data[j];
                    data[j]=temp;
              }

           }
        }
     System.out.println(Arrays.toString(data));
    }
}
