package structures;

public class Node<T> {

    private Node<T> next;
    private Node<T> last;
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
    public Node<T> getLast(){
        return last;
    }

    public void setLast(Node<T> last){
        this.last = last;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }

}
