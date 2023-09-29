package io.githib.ndimovt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFIFOQueueTest {
    private MyFIFOQueue<String> mfq;
    @BeforeEach
    void populateQueue(){
        mfq = new MyFIFOQueue<>();
        mfq.enqueue("Nikolay");
        mfq.enqueue("Todorov");
    }

    @Test
    void isEmpty() {
        assertFalse(mfq.isEmpty());
    }

    @Test
    void size() {
        assertEquals(2,mfq.size());
    }

    @Test
    void enqueue() {
        mfq.enqueue("Dimov");
        assertEquals(3,mfq.size());
    }

    @Test
    void dequeue() {
        assertEquals("Nikolay",mfq.dequeue());
        assertEquals(1,mfq.size());
    }
}