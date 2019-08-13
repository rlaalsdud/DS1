
public class SLinkedQueue implements Queue{
	private Node head;
	private Node rear;
	private int size;

	ArrayQueue q = new ArrayQueue(10);

	private class Node{
		Object object;
		Node next;

		Node(Object object, Node next){
			this.object = object;
			this.next = next;
		}
	}
	public String toString(Object object) {
		StringBuffer buf = new StringBuffer(object.toString());

		return buf.toString();
	}
	public void print() {
		System.out.print("*Singly Linked Queue = head");
		Node p = head;
		while(p != null) {
			System.out.print(" -> " + toString(p.object));
			p = p.next;
		}
		System.out.println();
		System.out.println();
	}
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			head = new Node(object, null);
			rear = head;
		}
		else {
			rear.next = new Node(object, null);
			rear = rear.next;
		}
		++q.rear;
		++size;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if(size == 0) throw new IllegalStateException("the queue is empty");
	
		return head.object;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if(size == 0) throw new IllegalStateException("the queue is empty");

		Object a;
		a = head.object;
		head = head.next;
		--size;
		--q.rear;
		return a;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void toArrayQueue() {
		System.out.println("[Change from SLinked_Q to Array_Q]");
		System.out.print("*Array Queu = [");
		Node p = head;
		while(p != null) {
			System.out.print(" "+toString(p.object)+ " ");
			if(p.next != null) {
				System.out.print(" | ");
			}
			p = p.next;
		}
		System.out.println("] (front: " + q.front + ", rear: " + q.rear+")");
	}
}
