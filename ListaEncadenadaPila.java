/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.LinkedList;
import java.util.List;

public class ListaEncadenadaPila<T> extends Pila<T> {

    private List<T> list;

    public ListaEncadenadaPila() {
        super(0); 
        this.list = new LinkedList<T>();
        this.size = 0;
    }
    

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        list.add(item);
        size++;
    }

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
