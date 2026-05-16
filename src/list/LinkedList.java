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

    /**
     * Method to add new data to the end of a LinkedList
     *
     * @param value value to add
     */

    @Override
    public void add(T value){
        Node<T> newNode = new Node<>(value);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Method to return an element from a specified index
     *
     * @param index position in list
     * @return data at provided position
     */

    @Override
    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
}
