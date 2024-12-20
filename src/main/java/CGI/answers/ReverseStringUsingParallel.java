package CGI.answers;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//how to reverse a string using parallel stream in java8
public class ReverseStringUsingParallel {
    public static void main(String[] args) {
        String s = "hyderabad is a beautiful city";
        String collect = IntStream.range(0, s.length())
                .mapToObj(i -> s.charAt(s.length() - 1 - i))
                .parallel().map(String::valueOf)
                .collect(Collectors.joining());
          System.out.println(collect);
    }

}
