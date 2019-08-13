import java.util.*;

public class OrderedTree {
	private Object root;
	private List<OrderedTree> subtrees;
	private int size;
	
	public OrderedTree() {
		
	}
	public OrderedTree(Object root) {
		this.root = root;
		subtrees = new LinkedList<OrderedTree>();
		size = 1;
	}
	public OrderedTree(Object root, List<OrderedTree> trees) {
		this(root);
		for(Iterator<OrderedTree> it = trees.iterator(); it.hasNext();) {
			Object object = it.next(); //리턴하고 다음
			if(object instanceof OrderedTree) { //타입이 같을 때
				OrderedTree tree = (OrderedTree)object;
				subtrees.add(tree);
				size += tree.size();
			}
			
		}
	}
	public void levelOrder(OrderedTree treeX) {
		ArrayQueue queue = new ArrayQueue();
		queue.add(treeX);
		System.out.print("Level Order : ");
		while(queue.size() != 0){
			OrderedTree parent = (OrderedTree) queue.remove();
			System.out.print(parent.root + " ");
			
			for(Iterator<OrderedTree> it = parent.subtrees.iterator(); it.hasNext();) {
				Object object = it.next();
				if(object instanceof OrderedTree) {
					OrderedTree tree = (OrderedTree)object;
					queue.add(tree);
				}
			}
		}
		
	}
	public String toString() {
		return (String) root;
	}

	public int size() {
		return size;
	}

}
