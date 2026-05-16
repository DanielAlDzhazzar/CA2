package stack;

import list.LinkedList;

/**
 * Stack implementation using composition and LinkedList
 *
 * @param <T> data type to be stored in stack
 */

public class Stack<T> {
    private LinkedList<T> list;

    /**
     * No argument constructor of a Stack
     */

    public Stack(){
        list = new LinkedList<>();
    }

    /**
     * Method to add a new value to a Stack
     *
     * @param value to be inserted
     */

    public void push(T value){
        list.add(value);
    }

    /**
     * Method to remove and return the top value
     *
     * @return removed value
     */

    public T pop(){
        return list.removeLast();
    }

    /**
     * Method to get a top value
     *
     * @return
     */

    public T peek(){
        if(isEmpty()){
            return null;
        }

        return list.get(list.size() - 1);
    }

    /**
     * Method to check whether Stack is empty
     *
     * @return true if yes, false if no
     */

    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     * Method to return size of a Stack
     *
     * @return size of a Stack
     */

    public int size(){
        return list.size();
    }
}
