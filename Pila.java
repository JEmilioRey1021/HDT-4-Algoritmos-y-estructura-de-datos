/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.Iterator;

public abstract class Pila<T> implements Iterable<T>, IStack<T> {
    protected T[] stack;
    protected int size;

    public Pila(int capacity) {
        stack = (T[]) new Object[capacity];
        size = 0;
    }

    /* saber si esta vacia la pila
     * @see IStack#isEmpty()
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /* el tamaño de la pila
     * @see IStack#size()
     */
    public int size() {
        return size;
    }

    /* el push de la pila
     * @see IStack#push(java.lang.Object)
     */
    public void push(T item) {
        if (size == stack.length) {
            resize(2 * stack.length);
        }
        stack[size++] = item;
    }

    /* el pop de la pila
     * @see IStack#pop()
     */
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        T item = stack[--size];
        stack[size] = null; // to avoid loitering
        if (size > 0 && size == stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }

    /* el peek de la pila
     * @see IStack#peek()
     */
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return stack[size - 1];
    }

    private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = stack[i];
        }
        stack = copy;
    }

    /* se trabaja con iterators para el stack
     * @see java.lang.Iterable#iterator()
     */
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private int current = size - 1;

        public boolean hasNext() {
            return current >= 0;
        }

        public T next() {
            if (!hasNext()) {
                throw new RuntimeException("No more items to return");
            }
            return stack[current--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
