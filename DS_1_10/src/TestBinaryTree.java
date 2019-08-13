
public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree(9);
		tree.levelorder();
		System.out.print("Preorder : ");
		tree.preorder(0); 
		System.out.println();
		
		BinaryTree tree2 = new BinaryTree(9, 100);
		tree2.levelorder();
		System.out.print("Preorder : ");
		tree2.preorder(0);
	}

}
