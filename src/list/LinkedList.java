package list;

/**
 * A singly-linked LinkedList, using both first and last nodes
 *
 * @param <T> type of data to be stored in a list
 */

public class LinkedList<T> implements MyList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * No argument constructor for creation of empty linked list
     */

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
}
