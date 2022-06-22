package crackinterview;

import java.util.EmptyStackException;

/**
 * this is stack implementation using linked list
 * stack supports belows operations
 * push,pop,isEmpty,peek
 * LIFO (Last In First Out)
 */
public class StackImpl<T> {

    private class StackNode<T> {
        private StackNode<T> next;
        private T data;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> newTop = new StackNode<>(item);
        newTop.next = top;
        top = newTop;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
