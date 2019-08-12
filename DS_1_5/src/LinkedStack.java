
public class LinkedStack {
	private Node top;
	private int size;
	
	private static class Node{
		int object;
		Node next;
		
		public Node(int v, Node top) {
			this.object = v;
			this.next = top;
		}
	}
	public int size() {
		return size;
	}
	public String toString(int num) {
		StringBuffer buf = new StringBuffer(Integer.toString(num));
		return buf.toString();
	}
	public void print() {
		Node p;
		p = top;
		System.out.println("Current Elements of Stack: top");
		while(p != null) {
			System.out.print("->" + toString(p.object));
			p = p.next;
		}
		System.out.println();
	}
	public int peek() {
		if(size == 0)throw new java.util.NoSuchElementException();
		return top.object;
	}
	public void push(int v) {
		top = new Node(v,top);
		size++;
		System.out.println("push : "+v);
	}
	public Node pop() {
		if(size == 0) throw new java.util.NoSuchElementException();
		Node oldTop = top;
		top = top.next;
		size--;
		return oldTop;
	}
	public int removesecond() {
		Node p = top;
		int _top = 0;
		if(size == 0 || size == 1) {
			return 0;
		}
		else {
			_top = p.next.object;
			top.next = top.next.next;
			size--;
			return _top;
		}
	}

	public Node reverse() {
		Node p = top; // 역순으로 변환시킬 리스트
		Node q = null; //역순으로 만들 노드
		Node r = null; // 역순으로 변환될 리스트
		
		while(p != null) {
			r = q;
			q = p;
			p = p.next;
			q.next = r;
		}
		top = q;
		return r;
	}
}
