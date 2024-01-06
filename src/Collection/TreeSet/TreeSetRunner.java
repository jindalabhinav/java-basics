package Collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(100);
        treeSet.add(100);
        treeSet.add(30);
        treeSet.add(30);

        treeSet.forEach(System.out::println);
        System.out.println(treeSet.floor(40));
    }
}
