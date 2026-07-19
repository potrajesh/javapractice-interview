package machinelearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortData {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> collect = numbers.stream().filter((a)->a%2==0).collect(Collectors.toList());
        
        System.out.println();


        }
}
