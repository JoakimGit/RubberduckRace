package rubberduck.KEA19c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void removeTest() {
        Queue queue = new Queue(1, 10);
        assertEquals(1, queue.remove().getNumber());
    }

    @Test
    void removeTest2() {
        Queue queue = new Queue(1, 10);
        assertEquals(queue.get(0), queue.remove());
    }

    @Test
    void removeTest3() {
        Queue queue = new Queue(1, 10);
        assertEquals(10, queue.size());
        queue.remove();
        assertEquals(9, queue.size());
    }

    @Test
    void addTest() {
        Queue queue = new Queue();
        queue.add(new Rubberduck(10));
        assertEquals(10, queue.get(0).getNumber());
    }

    @Test
    void sizeTest() {
        Queue queue = new Queue();
        assertNotEquals(1, queue.size());
        queue.add(new Rubberduck(15));
        assertEquals(1, queue.size());
    }
}