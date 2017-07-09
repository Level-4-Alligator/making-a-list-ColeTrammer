
/*

 *  Java Program to Implement Singly Linked List

 */

/*  Class Node  */
class Node {
	protected Object data;
	protected Node next;

	/* Constructor */
	public Node() {
		next = null;
		data = 0;
	}

	/* Constructor */
	public Node(Object d, Node n) {
		data = d;
		next = n;
	}

	/* Function to set link to next Node */
	public void setNext(Node n) {
		next = n;
	}

	/* Function to set data to current Node */
	public void setData(Object d) {
		data = d;
	}

	/* Function to get link to next node */
	public Node getNext() {
		return next;
	}

	/* Function to get data from current Node */
	public Object getData() {
		return data;
	}
}
