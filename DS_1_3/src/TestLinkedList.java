
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();

		list1.insertfirst(1);
		list1.insertfirst(2);
		list1.insertfirst(3);
		list1.insertfirst(4);
		list1.insertfirst(5);
		list1.insertfirst(6);
		list1.insertfirst(7);
		list1.insertfirst(8);
		list1.insertfirst(9);
		list1.insertfirst(10);

		list1.print();

		list1.contain(5);
		list1.contain(20);

		LinkedList list2 = new LinkedList();

		list2.insertlast(1);
		list2.insertlast(2);
		list2.insertlast(3);
		list2.insertlast(4);
		list2.insertlast(5);
		list2.insertlast(6);
		list2.insertlast(7);
		list2.insertlast(8);
		list2.insertlast(9);
		list2.insertlast(10);
		list2.print();

	}

}
