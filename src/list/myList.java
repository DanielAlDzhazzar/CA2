package list;

/**
 * An interface for a list
 *
 * @param <T> type of data stored in a list
 */

public interface myList<T> {
    void add(T value);
    T get(int index);
    boolean contains(T value);
    int size();
    boolean isEmpty();
    T removeLast();
    void clear();
}
