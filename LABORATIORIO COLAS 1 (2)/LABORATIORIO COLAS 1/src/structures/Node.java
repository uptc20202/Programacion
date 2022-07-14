package structures;

public class Node<T> {

    private Node<T> next;
    private T data;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }
}
