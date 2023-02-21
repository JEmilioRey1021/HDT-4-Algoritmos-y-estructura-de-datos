/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements IStack<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    /**
     * 
     */
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /* para saber si esta vacio. si esta vacio no puede hacer nada
     * @see IStack#isEmpty()
     */
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public T removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        T data = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;

        return data;
    }

    public T removeLast() {
        if (isEmpty()) throw new NoSuchElementException();

        T data = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;

        return data;
    }

    public boolean contains(T item) {
        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void printList() {
        Node<T> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public void push(T item) {
        addLast(item);
        
    }

    @Override
    public T pop() {
       return removeLast();
    }

    @Override
    public T peek() {
        Node<T> current = head;
        while (current != null) {
            current = current.next;
        }
        return current.data; 
    }
}
