package Streams;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        // OPTION 1
        for (Integer number: numbers) {
            System.out.println(number);
        }

        // OPTION 2
        // Create a stream from the collection
        numbers.
                stream()
                .forEach(value -> System.out.println(value));

        /// OPTION 3
        Stream.of(1, 2, 3).forEach(value -> System.out.println(value));

        // OPTION 4
        Stream.of(1, 2, 3).forEach(System.out::println);
    }
}
