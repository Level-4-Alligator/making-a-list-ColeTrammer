
public class LinkedList implements LinkedListInterface {

	private Node start = null;
	
	public LinkedList() {
		
	}
	
	@Override
	public boolean isEmpty() {
		return start == null;
	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		
		int count = 1;
		Node current = start;
		while (current.getNext() != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	@Override
	public void addFirst(Object data) {
		start = new Node(data, start);
	}

	@Override
	public void addLast(Object data) {
		if (isEmpty()) {
			addFirst(data);
			return; 
		}
		
		Node current = start;
		Node end = new Node(data, null);
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(end);
	}

	@Override
	public void add(Object data, int index) {
		if (index > size() || index < 0) {
			throw new IndexOutOfBoundsException("invalid remove index");
		}
		
		if (index == 0) {
			start = new Node(data, start);
			return;
		}
		
		Node current = start;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		current.setNext(new Node(data, current.getNext()));
	}

	@Override
	public void remove(int index) {
		if (index >= size() || index < 0) {
			throw new IndexOutOfBoundsException("invalid remove index");
		}
		
		if (index == 0) {
			start = start.getNext();
			return;
		}
		
		Node current = start;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
	}
	
	@Override
	public String toString() {
		if (isEmpty()) {
			return "";
		}
		
		String s = start.getData().toString();
		Node current = start;
		while (current.getNext() != null) {
			current = current.getNext();
			s += current.getData().toString();
		}
		return s;
	}

}
