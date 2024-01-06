package Collection.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        Pair<Integer> id1 = new Pair<>(2, 200);
        Pair<Integer> id2 = new Pair<>(1, 100);
        List<Pair<Integer>> ids = Arrays.asList(id1, id2);

        List<Integer> integers = Arrays.asList(3, 2, 1);
        Collections.sort(ids);
        System.out.println(ids
                .stream()
                .map(pair -> pair.getLeft() + " " + pair.getRight())
                .collect(Collectors.joining("\n"))
        );
    }
}
