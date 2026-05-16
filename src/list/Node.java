package list;

/**
 * Node for later implementation of linked list
 *
 * @param <T> data to be stored in a node
 */

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
