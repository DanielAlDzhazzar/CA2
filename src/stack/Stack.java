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

    public T peek(){
        if(list.isEmpty()){
            return null;
        }

        return list.get(list.size() - 1);
    }
}
