/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.ArrayList;

public class VectorPila<T> extends Pila<T> {

    private ArrayList<T> list;

    public VectorPila() {
        super(0); 
        this.list = new ArrayList<T>();
        this.size = 0;
    }
    

    /* saber si esta vacio
     * @see Pila#isEmpty()
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /* el tamaño del vector 
     * @see Pila#size()
     */
    public int size() {
        return size;
    }

    /* el push del vector
     * @see Pila#push(java.lang.Object)
     */
    public void push(T item) {
        list.add(item);
        size++;
    }

    /* el pop del vector
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

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return list.get(size - 1);
    }

}
