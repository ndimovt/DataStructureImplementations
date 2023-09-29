package io.githib.ndimovt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList<Double> mll;
    @BeforeEach
    void populateQueue() {
        mll = new MyLinkedList<>();
        mll.offerFirst(12.3);
        mll.offerLast(14.59);
    }

    @Test
    void size() {
        assertEquals(2,mll.size());
    }

    @Test
    void isEmpty() {
        assertFalse(mll.isEmpty());
    }

    @Test
    void offerFirst() {
        mll.offerFirst(26.3);
        assertEquals(26.3, mll.peekFirst());
        assertEquals(3,mll.size());
    }

    @Test
    void offerLast() {
        mll.offerLast(44.96);
        assertEquals(44.96, mll.peekLast());
        assertEquals(3,mll.size());
    }

    @Test
    void pollFirst() {
        assertEquals(12.3,mll.pollFirst());
        assertFalse(mll.isEmpty());
        assertEquals(1, mll.size());
    }

    @Test
    void pollLast() {
        assertEquals(14.59,mll.pollLast());
        assertFalse(mll.isEmpty());
        assertEquals(1, mll.size());
    }

    @Test
    void peekFirst() {
        assertEquals(12.3,mll.peekFirst());
    }

    @Test
    void peekLast() {
        assertEquals(14.59,mll.peekLast());
    }
}