package structures;

import java.util.Comparator;
import java.util.Iterator;

public class SimpleList<T> implements Iterable<T> {

	private Node<T> head;
	private Comparator<T> comparator;

	public SimpleList(Comparator<T> comparator){
		this.comparator = comparator;
	}
	
	public void insert(T data){
        Node<T> newNode = new Node<>(data);
        Node<T> aux = head;
        if(head == null){
        	head = newNode; 
        }else{
        	while (aux.getNext() != null){
				aux = aux.getNext();
			}
        	aux.setNext(newNode);
        }
	}

	public void remove(T target){
		boolean removed = false;
		if(isEmpty()){
			removed = true;
		}else{
			if(head.getData() == target){
				head = head.getNext();
			}else{
				Node<T> aux = head.getNext();
				Node<T> before = head;
				while (aux != null && !removed){ // "!removed" = "removed == false";
					if(comparator.compare(aux.getData(), target) == 0){
						before.setNext(aux.getNext());
						removed = true;
					}
					before = before.getNext();
					aux = aux.getNext();
				}
			}
		}
	}
	
	public T get(T data){
		Node<T> aux = head;
		boolean found = false;
		while (aux != null && !found){
			System.out.println(aux.getData());
			if (aux.getData() == data) {
				found = true;
			}
			aux = aux.getNext();
		}
		assert aux != null; //no se que monda hacer esto
		return aux.getData();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public String  show() {
		Node<T> aux = head;
		StringBuilder message = new StringBuilder();
		if(isEmpty()){
			message = new StringBuilder("la lista esta vacia");
		}else{
			while (aux.getNext() != null){
				message.append(aux.getData()).append("-");
				aux = aux.getNext();
			}
			message.append(aux.getData());
		}
		return message.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<>() {
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
	}
}
