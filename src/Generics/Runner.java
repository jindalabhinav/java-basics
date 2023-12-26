package Generics;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triple<String> tripleString = new Triple<>("left", "middle", "right"); // Compile time type safety
        Triple<String> tripleString1 = new Triple<>("left1", "middle1", "right1"); // Compile time type safety
        Triple<Integer> tripleInteger = new Triple<>(1,2,3);
        Triple<Integer> tripleInteger1 = new Triple<>(11,21,31);
        List<Triple<Integer>> triples = List.of(tripleInteger, tripleInteger1);

        print(triples);
        System.out.println(calculateAvg(tripleInteger));
        System.out.println(calculateAvg(tripleInteger1));
    }

    private static <TYPE> void print(List<Triple<TYPE>> triples) {
        for (var triple: triples) {
            print(triple);
        }
    }

    private static <T> void print(Triple<T> triple) {
        System.out.println("left: " + triple.getLeft() + ", middle: " + triple.getMiddle() + ", right: " + triple.getRight());
    }

    private static Double calculateAvg(Triple<? extends Number> triple) {
        return 0.0;
    }
}
