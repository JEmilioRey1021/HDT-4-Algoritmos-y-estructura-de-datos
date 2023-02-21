/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
public class Node<T>{
    T data;
    Node next;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}