
public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayQueue a = new ArrayQueue(10);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.print();
		
		a.remove();
		a.remove();		
		a.print();
		
		System.out.println();
		
		SLinkedQueue s = new SLinkedQueue();
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.print();
		
		s.remove();
		s.remove();
		s.remove();
		s.remove();
		s.print();
		
		s.add(10);
		s.add(11);
		s.add(12);
		s.print();
		
		s.toArrayQueue();
		
	}

}
