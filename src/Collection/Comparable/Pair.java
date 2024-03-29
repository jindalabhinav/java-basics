package Collection.Comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pair<T extends Comparable<T>> implements Comparable<Pair<T>> {
    private T left;
    private T right;

    @Override
    public int compareTo(Pair<T> incoming) {
        return getLeft().compareTo(incoming.getLeft());
    }
}
