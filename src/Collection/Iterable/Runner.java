package Collection.Iterable;

import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        // Create a linked list of nodes
        Node head = new Node(1, new Node(2, new Node(3, null)));

        // Iterate over the nodes using the enhanced for-loop, which implicitly
        // calls the iterator() method to obtain an iterator.
        for (Integer data : head) {
            System.out.println(data); // Output: 1 2 3
        }

        // Or, use the iterator directly:
        Iterator<Integer> iterator = head.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Output: 1 2 3 (again)
        }
    }

}
