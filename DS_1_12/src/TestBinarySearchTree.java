
public class TestBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree a = new BinarySearchTree();
		System.out.println("����");
		a.iter_insert(5);
		a.iter_insert(10);
		a.iter_insert(1);
		a.iter_insert(3);
		a.iter_insert(7);
		a.iter_insert(13);
		a.iter_insert(11);
		a.iter_insert(15);
		a.iter_insert(12);

		a.inorder();	 
		
		System.out.println("����");
		System.out.println();


		a.delete(12);
		a.delete(1);
		a.delete(10); 
		System.out.println();
		System.out.println("inoreder ���");
		a.inorder();
		
		

	}

}
