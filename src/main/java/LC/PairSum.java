package LC;

import java.util.HashMap;

public class PairSum {
    public static void main1(String[] args) {
       Integer [] arr = {18,9};
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int target = 4;
       for(int a:arr){
          int element =  target-a;
           if(integerIntegerHashMap.containsKey(a)){
              System.out.println("Pair found: (" + element + ", " + a + ")");

           }
           integerIntegerHashMap.put(a,1);
           System.out.println("data"+integerIntegerHashMap);
       }
    }

    public static void main(String[] args) {
        String s= "abcda";
      int [] arr = new int[128];
      for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
          arr[c]++;
      }
      for (int i=0;i<arr.length;i++){
          if(arr[i]>0) {
              System.out.println((char) i + "-->" + arr[i]);
          }
      }
    }
}
