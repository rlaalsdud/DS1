import java.util.*;
public class BinaryTree {
	private int[] tree;
	private int size;
	private Random random;
	
	public BinaryTree(int a, int seed) { //tree에 크기 a만큼의 배열을 생성한 후, seed를 설정하여 random한 값으로 a개의 노드 생성
		tree = new int[a];
		size = a;
		random = new Random(seed);
		random.setSeed(seed);
		for(int i = 0; i < size; i++) {
			tree[i]	 = random.nextInt(seed);
		}
	}
	public BinaryTree(int a) {//tree에 크기 a만큼의 배열 생성 후, 0부터 a-1개의 정수값으로 채우기
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
	public void preorder(int i) {//preorder순회 인덱스 i를 root로 하는 서브트리에서 수행할 것
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
