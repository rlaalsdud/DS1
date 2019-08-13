import java.util.*;

public class BinarySearchTree {
	private Comparable<Object> key;
	private BinarySearchTree left, right;
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
	public BinarySearchTree() {
		key = null;
		right = null;
		left = null;
		size = 0;
	}
	public BinarySearchTree(int key) {
		this.key = new Node(key);
		size = 1;
		right = null;
		left = null;
	}
	public int treesize() {
		return size;
	}
	public boolean iter_insert(int key) {	
		Stack<Object> stack = new Stack<Object>();
		BinarySearchTree cNode = (BinarySearchTree)this;
		if(cNode.key == null) {
			this.key = new Node(key);
			size++;
			return true;
		}
		else {

			BinarySearchTree Size = null;

			while(cNode.key.compareTo(key) != 0) {
				stack.push(cNode);

				if(cNode.key.compareTo(key) == -1) {
					if(cNode.right != null) {
						cNode = cNode.right;
					}
					else {
						BinarySearchTree a = new BinarySearchTree(key);
						cNode.right = a;

						while(!stack.empty()) {
							Size = (BinarySearchTree)stack.pop();
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
						BinarySearchTree b = new BinarySearchTree(key);
						cNode.left = b;

						while(!stack.empty()) {
							Size = (BinarySearchTree)stack.pop();
							Size.size++;
						}
						return true;
					}
				}

			}


			return false;
		}
	}
	public boolean delete(int key) {
		if(size == 0) {
			return false;
		}
		else {
			if(this.key.compareTo(key) == 0) {
				if(this.right == null && this.left == null){
					this.key = null;
				}
				else if(this.right != null && this.left == null) {
					this.key = this.right.key;
					this.left = this.right.left;
					this.right = this.right.right;
				}
				else if(this.right == null && this.left == null) {
					this.key = this.left.key;
					this.right = this.left.right;
					this.left = this.left.left;
				}
				else if(this.right != null && this.left != null) {
					this.key = delete_minimun(this);
					Node p = (Node)this.key;
					System.out.println("*Alternative Node : " + p.key);
				}
				size--;
				return true;
			}
			else if(this.key.compareTo(key) == 1) {
				if(this.left != null) {
					if(this.left.delete(key) == true) {
						if((size - this.left.size) != 1) {
							size--;
							return true;
						}
					}
					return false;
				}

			}
			else{
				if(this.right != null) {
					if(this.right.delete(key) == true){
						if(size - this.right.size != 1) {
							size--;
						}
						return true;
					}
					return false;
				}
			}
		}

		return false;
	}


	public Comparable<Object> delete_minimun(BinarySearchTree T) {
		BinarySearchTree Size = null;
		Comparable<Object> replace;
		Stack<Object> stack = new Stack<Object>();
		
		T = T.right;
		stack.push(T);
		
		while(T.left != null ){
			T = T.left;
			stack.push(T);
		}
		if(T.right != null) {
			while(!stack.empty()) {
				Size = (BinarySearchTree)stack.pop();
				Size.size--;
			}
			replace = T.key;
			T.key = T.right.key;
			T.left = T.right.left;
			T.right = T.right.right;
		}
		else {
			while(!stack.empty()) {
				Size = (BinarySearchTree)stack.pop();
				Size.size--;
			}
			replace = T.key;
			T = null;
		}
		return replace;
	}

	public void inorder() {
		if(size == 0) {
			return;
		}
		Node p = (Node) this.key;
		if(this.key != null) {  

			if(left != null) 
				left.inorder();  
			System.out.println("Visited : " + p.key + ", TreeSize : "+ size);

			if(right != null)
				right.inorder();


		}
	}


} 
