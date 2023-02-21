/**
 * @author Jose Emilio Reyes Paniagua 22674
 */

import java.util.ArrayList;

public class ArrayListPila<T> extends Pila<T> {

    private ArrayList<T> list;

    public ArrayListPila() {
        super(0); 
        this.list = new ArrayList<T>();
        this.size = 0;
    }
    

    /* 
     * para saber si esta vacio, entonces es boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /* 
     * el tamaño de la pila, entonces es it¿nt. 
     */
    public int size() {
        return size;
    }

    /* 
     * la funcion de push de la pila para arraylist
     */
    public void push(T item) {
        list.add(item);
        size++;
    }

    /* La funcion pop de la pila para arraylist, con su mensaje de error
     * @see Pila#pop()
     */
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        T item = list.remove(size - 1);
        size--;
        return item;
    }

    /* la funcion peek para la pila de arraylist
     * @see Pila#peek()
     */
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return list.get(size - 1);
    }

}



