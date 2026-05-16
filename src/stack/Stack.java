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
}
