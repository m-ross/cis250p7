package lab07;

import lab07.*;

public class Node {
	private Element data;
	private Node next;

	public Node() { }

	public Node(Element data) {
		set(data);
	}

	public Node(Element data, Node next) {
		set(data, next);
	}

	public void set(Element data) {
		this.data = data.clone();
	}

	public void set(Element data, Node next) {
		this.data = data.clone();
		this.next = next;
	}

	public void setData(Element data) {
		this.data = data.clone();
	}

	public Element getData( ) {
		if(data == null)
			return null;
		else
			return data.clone();
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext( ) {
		return next;
	}
}