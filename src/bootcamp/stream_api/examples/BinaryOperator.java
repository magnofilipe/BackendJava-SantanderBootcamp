package bootcamp.stream_api.examples;

import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);

        int result = numbers.stream()
            .reduce(0, Integer::sum);

    // Também pode ser feito com:
    // int result = numbers.stream()
    //      .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Soma total dos números: " + result);
    }
}
