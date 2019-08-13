

public class SLinkedQueue implements Queue{
	
	private class Node {
		Object object;
		Node next;
		Node(Object object) { this.object=object; }
		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}
	
	private Node head;
	private Node rear;
	private int size;
	
	public void add(Object object) {
		if(this.empty()) {
			head = new Node(object, null);
			rear = head;
		}
		else {
			rear.next = new Node(object, null);
			rear = rear.next;
		}
		
		++size;
	}


	public Object first() {
		if(size == 0) throw new IllegalStateException("the queue is empty");
		return head.object;

	}
	
	public Object remove() {
		if(size == 0) throw new IllegalStateException("the queue is empty");

		Object a;

		a=head.object;
		head = head.next;
		--size;
		return a;

	}

	public int size() {
		return this.size;
	}
	
	public boolean empty() {
		return this.head == null;
	}
	
	
	
	public void print() {
		System.out.println(this.toString()+"\n");
	}
	
	public String toString() {
		String str = " * Singly Linked Queue = head";
		
		Node ptr = this.head;
		
		while(ptr != null) {
			str = str + " -> " + ptr.object;
			ptr = ptr.next;
		}
		return str;
	}



	
}
