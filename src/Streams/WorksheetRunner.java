package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class WorksheetRunner {
    public static void main(String[] args) {
        question8();
    }

    private static void question1() {
        System.out.println("Find below a list of integers. Iterate over it and print the square of each number.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Printing and calculating squares
        numbers
                .stream()
                .forEach(value -> System.out.println(value * value));


        // Calculating squares and then printing
        numbers
                .stream()
                .map(val -> val * val)
                .forEach(System.out::println);

        System.out.println();
    }

    private static void question2() {
        System.out.println("Find below a list of integers. Iterate over it and print every even number.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers
                .stream()
                        .forEach(val -> {
                            if ((val & 1) == 0) {
                                System.out.println(val);
                            }
                        });
        // OR

        numbers
                .stream()
                .filter(v -> (v & 1) == 0)
                .forEach(System.out::println);
    }

    private static void question3() {
        System.out.println("For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(v -> (v & 1) == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    private static void question4() {
        System.out.println("For a list of integers, return a list of the squares of each number.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squares = numbers
                .stream()
                .map(v -> v * v)
                .collect(Collectors.toList());
        System.out.println(squares);
    }

    private static void question5() {
        System.out.println("For a list of strings, return a list of the length of each string.");
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");

        List<Integer> squares = names
                .stream()
                .map(v -> v.length())
                .toList();
        System.out.println(squares);
    }

    private static void question6() {
        System.out.println("For a list of strings, filter out the strings which do not start with the letter `T` and then uppercase the remaining strings.");
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");


        System.out.println();
    }

    private static void question8() {
        System.out.println("For a list of integers, find the sum of all the numbers.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sum = numbers
                .stream()
                .reduce(0,
                        (currVal, currElem) -> currVal + currElem
                );

        System.out.println(sum);
    }


}
