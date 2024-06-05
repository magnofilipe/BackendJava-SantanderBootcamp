package bootcamp.stream_api.examples;

import java.util.Arrays;
import java.util.List;

public class Function {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubleNumbers = numbers.stream()
            .map(n -> n * 2)
            .toList();

        doubleNumbers.forEach(System.out::println);
    }
}
