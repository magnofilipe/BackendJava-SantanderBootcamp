package bootcamp.stream_api.examples;

import java.util.Arrays;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        words.stream()
            .filter(w -> w.length() > 5)
            .forEach(System.out::println);
    }
}
