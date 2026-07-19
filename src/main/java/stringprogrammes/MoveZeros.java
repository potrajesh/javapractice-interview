package stringprogrammes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {

    public static void main1(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("04/16/1987");
        String format1 = format.format(new Date());
        System.out.println(format1);
        Period age = Period.between(LocalDate.of(1987, 04, 16), LocalDate.now());
        System.out.println("Years-->" + age.getYears() + "  ,Month-->  " + age.getMonths() + ", Days--> " + age.getDays());
    }
    public static void main2(String[] args) {
        int [] data = {10, 0, 3, 0, 7,0,3,6,0};
        List<Integer> collect = Arrays.stream(data).boxed().sorted((a, b) -> (a == 0 ? 1 : 0) - (b == 0 ? 1 : 0)).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        Integer [] data = {2,3,0,0};
        int j=0;
        int[] newArray = new int[data.length];
        for (int i = 0; i < data.length-1; i++) {
            if(data[i]!=0){
               newArray[j++] = data[i];
            }
        }
        System.out.println(Arrays.toString(newArray));




    }
}
