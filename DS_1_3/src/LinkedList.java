
public class LinkedList {
	Node startNode;

	public LinkedList() {
		startNode = null;
	}
	public void insertlast(int x) {
		if(startNode == null) {
			startNode = new Node(x);
		}   
		else {
			Node head = startNode;
			while(head.Next() != null) {
				head = head.Next();
			}
			Node p = new Node(x);
			p.setValue(x);
			head.setNext(p);
		}
	} 
	public void insertfirst(int x) {
		if(startNode == null) {
			startNode = new Node(x);
		}
		else {
			Node p = new Node(x);
			p.setNext(startNode);
			startNode = p;
		}
	}
	public void contain(int x) {
		Boolean found = false;
		while(startNode != null) {
			if(startNode.Value() == x) {
				found = true;
				break;
			}
			else {
				startNode = startNode.Next();
			}
		}
		System.out.println(found);
	}
	public void print() {
		  System.out.print("LIST : ");

	      Node currentNode;

	      for(currentNode = startNode; currentNode != null; currentNode = currentNode.Next()) {
	         System.out.print(currentNode.Value() + " ");
	      }
	      System.out.println(" ");
	   }
	}
