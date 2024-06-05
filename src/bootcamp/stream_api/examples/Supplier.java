package bootcamp.stream_api.examples;

import java.util.List;
import java.util.stream.Stream;

public class Supplier {
    public static void main(String[] args) {
        List<String> repeat = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
            .limit(5)
            .toList();

        repeat.forEach(System.out::println);
    }
}
