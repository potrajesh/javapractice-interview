package allinterviews.com.java8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersStream {
	public static void main(String[] args) {

        String input = "india is the best country".replaceAll("\\s+", "");

        System.out.println(
            input.chars()
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(e -> e.getValue() > 1)
                 .collect(Collectors.toList())
        );
    }
}
