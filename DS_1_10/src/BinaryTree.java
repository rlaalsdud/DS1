import java.util.*;
public class BinaryTree {
	private int[] tree;
	private int size;
	private Random random;
	
	public BinaryTree(int a, int seed) { //tree�� ũ�� a��ŭ�� �迭�� ������ ��, seed�� �����Ͽ� random�� ������ a���� ��� ����
		tree = new int[a];
		size = a;
		random = new Random(seed);
		random.setSeed(seed);
		for(int i = 0; i < size; i++) {
			tree[i]	 = random.nextInt(seed);
		}
	}
	public BinaryTree(int a) {//tree�� ũ�� a��ŭ�� �迭 ���� ��, 0���� a-1���� ���������� ä���
		tree = new int[a];
		size = a;
		for(int i = 0; i < size; i ++) {
			tree[i] = i;
		}
	}
	public void levelorder() {
		System.out.print("Level Order : ");
		for(int i = 0; i < size; i++) {
			System.out.print(tree[i] + " ");
		}
		System.out.println();
	}
	public void preorder(int i) {//preorder��ȸ �ε��� i�� root�� �ϴ� ����Ʈ������ ������ ��
		if(i < size) {
			System.out.print(tree[i]+ " ");
			preorder(2*i + 1);
			preorder(2*i + 2);
		}
	}
	public int size() {
		return size;
	}


}
