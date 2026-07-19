package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        findDuplicates(nums);
    }
   //iam in test
    private static HashMap<Integer, Integer>  findDuplicates(int[] nums) {
        HashMap<Integer, Integer> mapData = new HashMap<>();
        for (int n : nums) {
            if (mapData.containsKey(n)) {
                mapData.put(n, mapData.get(n) + 1);
            } else {
                mapData.put(n, 1);
            }
        }
        System.out.println(mapData.entrySet().toString());
        return mapData;
    }

}
