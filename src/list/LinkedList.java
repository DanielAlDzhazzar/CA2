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

    /**
     * Method to check whether the list contains a value provided by user
     *
     * @param value to be searched for
     * @return whether user-provided value was found in a LinkedList
     */

    @Override
    public boolean contains(T value){
        Node<T> current = head;

        while (current != null){
            if (current.data.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Method to return current size of a LinkedList
     *
     * @return current size of a LinkedList
     */

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
