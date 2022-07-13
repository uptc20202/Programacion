package structures;

import java.util.Comparator;
import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Comparator<T> comparator;

    public DoubleLinkedList(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void insert(T data) { //DONE
        Node<T> newNode = new Node<>(data);
        Node<T> aux = head;
        if (head == null) {
            head = newNode;
        } else {
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode); //primer nodo conectado
            newNode.setLast(aux); //segundo nodo conectado
        }
    }

    public void insertInOrder(T data){
        Node<T> newNode = new Node<>(data);
        Node<T> aux = head;
        boolean placed = false;
        if(head == null){  //Por si es la cabeza 0 NODOS
            head = newNode;
        }else if(comparator.compare(head.getData(), data) > 0 && comparator.compare(head.getData(), data) != 0){ //si hay cabeza pero es atras de la cabeza
            head.setLast(newNode);
            newNode.setNext(head);
            head = newNode;
        }
        while (aux != null && !placed){
            if(comparator.compare(aux.getData(),data) == 0){
                placed = true;
            }else if(comparator.compare(aux.getData(),data) > 0){ //aux es mayor que data
                aux.getLast().setNext(newNode); //
                newNode.setNext(aux);
                newNode.setLast(aux.getLast());
                aux.setLast(newNode);
                placed = true;
            }else if(comparator.compare(aux.getData(),data) < 0 && aux.getNext() == null){
                aux.setNext(newNode);
                newNode.setLast(aux);
                placed = true;
            }
            aux = aux.getNext();
        }
    }

    public T get(T data) { //Done not much changes
        boolean found = false;
        Node<T> aux = head;
        if(comparator.compare(head.getData(),data)==0){
            found = true;
        }
        while (aux != null && !found) {
            if (comparator.compare(aux.getData(), data) == 0) { //aca es el comparator
                found = true;
            }
            aux = aux.getNext();
        }
        return aux.getData();
    }

    public void removeByRanges(T begining, T end  ){
        Node<T> aux = head;
        Node<T> last;
        while (aux != null){
            if(comparator.compare(head.getData(),begining) >= 0 && comparator.compare(head.getData(),end) <= 0){ //Si vamos a borraR LA cabeza
                if(head.getNext() == null){
                    head = null;
                }else if(head.getNext() != null){
                    head = head.getNext();
                }
            }else if(comparator.compare(aux.getData(),begining) >= 0 && comparator.compare(aux.getData(),end) <= 0){
                last = aux.getLast();
                last.setNext(aux.getNext());
                last.getNext().setLast(last);
            }
            aux = aux.getNext();
        }
    }

    public void remove(T target) { //Altos cambios
        boolean removed = false;
        Node<T> aux = head.getNext();
        Node<T> before = head;
        if(comparator.compare(head.getData(),target) == 0 && head.getNext() != null){
            head = head.getNext();
        }else if(comparator.compare(head.getData(),target) == 0 && head.getNext() == null){
            head = null;
        }else{


            while (aux != null && !removed){
                if(comparator.compare(aux.getData(),target) == 0 && aux.getNext() != null){
                    before.setNext(aux.getNext());
                    before.getNext().setLast(before);
                    removed = true;
                }else if(comparator.compare(aux.getData(),target) == 0 && aux.getNext() == null){
                    before.setNext(null);
                }
                aux = aux.getNext();
                before = before.getNext();
            }

        }
    }

    public boolean isEmpty() { //DONE
        return head == null;
    }

    public String  show() { //DONE
        Node<T> aux = head;
        StringBuilder message = new StringBuilder();
        if(isEmpty()){
            message = new StringBuilder("la lista esta vacia");
        }else{
            while (aux.getNext() != null){
                message.append(aux.getData()).append("\n");
                aux = aux.getNext();
            }
            message.append(aux.getData());
        }
        return message.toString();
    }


    @Override
    public Iterator<T> iterator() {
         Iterator<T>  myIterator = new Iterator<T>() {
             Node<T> actual = head;
             @Override
             public boolean hasNext() {
                 return actual != null;
             }

             @Override
             public T next() {
                 T data = actual.getData();
                 actual = actual.getNext();
                 return data;
             }
         };
        return myIterator;
    }
}
