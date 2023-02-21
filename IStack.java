/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
public interface IStack<E> {
    boolean isEmpty();
    int size();
    void push(E item);
    E pop();
    E peek();
}
