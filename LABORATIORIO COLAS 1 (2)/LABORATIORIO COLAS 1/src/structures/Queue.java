package structures;

public class Queue<T>{

    Node<T> top;

    public Queue(){
    }

    public void push(T data){ //Firts in Firts Out
        Node<T> newNode = new Node<>(data);
        if(top == null){
            top = newNode;
        }else{
            Node<T> aux = top;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }

    }

    public T poll(){
        if(top == null){
            return null;
        }
        Node<T> aux = top;
        top = top.getNext();
        return aux.getData();
    }

    public T peek(){
        if(top == null){
            return null;
        }
        return top.getData();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public boolean exist(T data){
        Node<T> aux = top;
        boolean found = false;
        while (aux != null){
            if(aux.getData() == data){
                found = true;
            }
            aux = aux.getNext();
        }
        return found;
    }

    public String show(){
        StringBuilder str = new StringBuilder();
        Node<T> aux = top;
        while (aux != null){
            str.append(aux.getData()).append(" ");
            aux = aux.getNext();
        }
        return str.toString();
    }

    public int getLength(){
        int length = 0;
        Node<T> aux = top;
        while (aux !=null){
            length++;
            aux = aux.getNext();
        }
        return length;
    }
}
