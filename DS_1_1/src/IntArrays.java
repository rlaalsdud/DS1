import java.util.*;
public class IntArrays {
	private int n;
	private Random rng;
	private int[] a;
	private int size;

	public IntArrays(int n) {
		a = new int[n];
		rng = new Random();
		size = 0;
		n = n;
		size = 0;
		System.out.println("길이 " + n + "인 배열을 생성하였습니다.");
		for(int i = 0; i < 2/n; i++) {
			System.out.println(rng.nextInt(10));
		}
		System.out.println(""); 

	}

	public void print() {
		System.out.print("배열 데이터 : ");
		for(int i = 0; i < size; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");

	}
	public void add(int x) {
		int[]aa = new int[2*a.length];

		if(size == a.length) {
			System.arraycopy(a, a[0] , aa , aa[0] , a.length);
			a = aa;
			a[size] = x;
			System.out.println("데이터" + x + "의 삽입이 완료되었습니다.");
		}
		else {
			a[size] = x;
			size++;
			System.out.println("데이터" + x + "의 삽입이 완료되었습니다.");
		}
	}
	public void remove(int x) { 
		for(int i = 0; i < size; i++) {
			if(a[i] == x) {
				for(int j = i; j < size-1; j++) {
					a[j] = a[j+1];
				} 
				System.out.println("데이터 "+ x +"의 삭제가 완료되었습니다.");
				size--;
				break;
			}
		}
	}
}
