
public class TestIntArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrays a = new IntArrays(10);
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.print();
		
		a.remove(1);
		a.remove(3);
		a.remove(7);
		a.print();
	}

}
