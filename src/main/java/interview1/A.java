package interview1;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a string String str = "helaleleooo";, print the first repeating character in the string.
//Output: e
public class A {

    public static void main(String[] args) {
        HashSet<Character> objects = new LinkedHashSet<>();
        String str = "helaleleooo";
        Character first = str.chars().
                mapToObj(c -> (char) c).
                filter(c->!objects.add(c)).findFirst().get();
        System.out.println(first);
        str.chars().
                mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    //id,salary,dept //update dept on id

}