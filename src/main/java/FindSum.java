import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindSum {
    public static void main(String[] args) {
        Integer [] sum = {1,2,3};
        List<Integer> list = Arrays.asList(sum);
        //sum,count,avg,max
        Double sum1 = list.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println(sum1);

    }

}