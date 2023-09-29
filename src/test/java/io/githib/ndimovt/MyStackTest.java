package io.githib.ndimovt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack<String> ms;
    @BeforeEach
    void populateStack(){
        ms = new MyStack<>();
        ms.push("One");
        ms.push("Two");
        ms.push("Tree");
    }

    @Test
    void isEmpty() {
        assertFalse(ms.isEmpty());
    }

    @Test
    void size() {
        assertEquals(3,ms.size());
    }

    @Test
    void push() {
        ms.push("Four");
        assertEquals(4, ms.size());
    }

    @Test
    void pop() {
        assertEquals("Tree", ms.pop());
        assertEquals(2, ms.size());
    }
}