
public class Node {

	private Node next;
	private int value;
	
	public Node(int a) {
		this.value = a;
	} 
	public Node(Node next) {
		this.next = next;
	}
	public int Value() {
		return this.value;	 
	}
	public Node Next() {
		return next;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}
