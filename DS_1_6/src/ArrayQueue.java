
public class ArrayQueue implements Queue{
	private Object[] a;
	public int front = -1;
	public int rear = -1;
	public ArrayQueue(int capacity) {a = new Object[capacity];}

	public String toString(Object object) {
		StringBuffer buf = new StringBuffer(object.toString());

		return buf.toString();
	}

	public void print() {
		System.out.print("*Array Queue = [");
		for(int i = 0; i <= rear; i++) {
			System.out.print(" " + a[i] + " "); 
			if(i != rear) {
				System.out.print(" | ");
			}
		}
		System.out.println("] (front: " + front + ", rear: " + rear+")");
		System.out.println();
	}
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			front = -1;
			rear = 0;
			a[rear] = object;
		}
		else {
			rear++;
			a[rear] = object;
		}
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			return null;	
		}
		else {
			return a[front+1];
		}
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			return null;
		}
		else {
			return a[++front] = null;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (rear - front);
	}
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(this.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}

}
