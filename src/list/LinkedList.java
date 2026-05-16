package list;

public class LinkedList<T> implements MyList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
}
