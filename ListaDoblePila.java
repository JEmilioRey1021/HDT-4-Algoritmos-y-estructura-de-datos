/**
 * @author Jose Emilio Reyes Paniagua 22674
 */
import java.util.EmptyStackException;
public class ListaDoblePila<T> extends Pila<T>{
        Node<T> top;
        
        /**
         * constructor
         */
        public ListaDoblePila() {
            super(0); 
            this.top = null;
        }
        
        public void push(T data) {
            Node newNode = new Node(data);
            size ++; 
            newNode.next = top;
            top = newNode;
        }
        
        public T pop() {
            if (top == null) {
                throw new EmptyStackException();
            }
            T data = top.data;
            top = top.next;
            size --; 
            return data;
        }
        
        public T peek() {
            if (top == null) {
                throw new EmptyStackException();
            }
            return top.data;
        }
        
        public boolean isEmpty() {
            return top == null;
        }
}
    


