package crackinterview;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * this is queue implementation using linked list
 * queue supports belows operations
 * add,remove,isEmpty,peek
 * FIFO (First In First Out)
 */
public class QueueImpl<T> {
    private class QueueNode<T> {
        private QueueNode<T> next;
        private T data;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T data) {
        QueueNode<T> newLast = new QueueNode<>(data);

        if (last != null) {
            last.next = newLast;
        }
        last = newLast;

        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null)
            throw new NoSuchElementException();
        T data = first.data;
        first = first.next;

        if (first == null)
            last = null;

        return data;
    }

    public T peek() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
