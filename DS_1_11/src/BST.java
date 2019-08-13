
import java.util.Stack;

public class BST {
	private Comparable key;
	private BST left, right;
	private int size;

	private class Node implements Comparable<Object>{
		public int key;

		public Node(int key) {
			this.key = key;
		}

		@Override
		public int compareTo(Object object) {
			// TODO Auto-generated method stub
			if(this.key < (int)object) {
				return -1;
			} 
			else if(this.key == (int)object) {
				return 0;
			}
			else {
				return 1;
			}
		}
	}
	public BST() {
		key = null;
		right = null;
		left = null;
		size = 0;
	}
	public BST(int key) {
		this.key = new Node(key);
		size = 1;
	}
	public int treesize() {
		return size;
	}
	public boolean recu_insert(int key) {
		BST cNode = this; 
		boolean a = false;
		if (cNode.key == null) {
			this.key = new Node(key);
			size++;
			return true;
		} 
		else {
			if (cNode.key.compareTo(key) == 1) {
				if (cNode.left != null) {
					if (cNode.left.key.compareTo(key) == 0) {
						return false;
					}
					a = cNode.left.recu_insert(key);
					if(a) {
						size++;
					}

				} 
				else {
					cNode.left = new BST(key);
					size++;
				}
			}

			else if (cNode.key.compareTo(key) == -1) {
				if (cNode.right != null) {
					if (cNode.right.key.compareTo(key) == 0) {
						return false;
					}
					a = cNode.right.recu_insert(key);
					if(a) {
						size++;
					}

				} else {
					cNode.right = new BST(key);
					size++;
				}

			} else {
				return false;
			}
			return true;

		}

	}
		public boolean iter_insert(int key) {	
			Stack<Object> stack = new Stack<Object>();
			BST cNode = (BST)this;
			if(cNode.key == null) {
				this.key = new Node(key);
				size++;
				return true;
			}
			else {

				BST Size = null;

				while(cNode.key.compareTo(key) != 0) {
					stack.push(cNode);

					if(cNode.key.compareTo(key) == -1) {
						if(cNode.right != null) {
							cNode = cNode.right;
						}
						else {
							BST a = new BST(key);
							cNode.right = a;

							while(!stack.empty()) {
								Size = (BST)stack.pop();
								Size.size++;
							}
							return true;
						}
					}
					else if(cNode.key.compareTo(key) == 1) {
						if(cNode.left != null) {
							cNode = cNode.left;
						}
						else {
							BST b = new BST(key); 
							cNode.left = b;

							while(!stack.empty()) {
								Size = (BST)stack.pop();
								Size.size++;
							}
							return true;
						}
					}

				}


				return false;
			}
		}
	public void inorder() {
		Node p = (Node) this.key;
		if (this.key != null) {

			if (left != null)
				left.inorder();
			System.out.println("Visited : " + p.key + ", TreeSize : " + size);

			if (right != null)
				right.inorder();

		}
	}
}
