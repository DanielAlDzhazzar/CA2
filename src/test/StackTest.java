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

}
