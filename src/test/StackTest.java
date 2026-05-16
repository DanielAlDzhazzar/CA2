package test;

import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Stack
 */

public class StackTest {

    /**
     * Test to check pushing and popping
     */

    @Test
    public void testPushPop(){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    /**
     * Test to check peek
     */

    @Test
    public void testPeek(){
        Stack<String> stack = new Stack<>();

        stack.push("hello");

        assertEquals("hello", stack.peek());
    }

    /**
     * Test to check empty stack
     */

    @Test
    public void testEmptyStack(){
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.isEmpty());
        assertNull(stack.pop());
    }

    /**
     * Test to check duplicate values
     */

    @Test
    public void testDuplicates(){
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(5);

        assertEquals(5, stack.pop());
        assertEquals(5, stack.pop());
    }

    /**
     * Test to check empty list
     */

    @Test
    public void testPeekEmpty(){
        Stack<Integer> stack = new Stack<>();

        assertNull(stack.peek());
    }

    /**
     * Test to check Stacks LIFO compliance
     */

    @Test
    public void testLIFOOrder(){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }
}
