import java.util.Random;

public class IntArrays {
	private int [] a;
	private int n;
	private Random rng;
	private int size;
	
	
	public IntArrays(int n) {
		this.a = new int[n];
		this.rng = new Random();
		this.n= n;
		this.size = 0;
		
		System.out.println("���� "+ n +"�� �迭�� �����Ͽ����ϴ�.");
		System.out.print("�迭 ������ : ");
		for(int i = 0; i < n/2; i++) {
			System.out.print(rng.nextInt(10));
		}
		System.out.println("");
	}

	public void print() {
		
		System.out.print("�迭 ������ : ");
		for(int i = 0; i < this.size; i++) {
			System.out.print(this.a[i]);
		}
		System.out.println("");
		
	}
	public void add(int x) { 
		int[] aa =  new int[2 * a.length]; 

		if(this.size == this.a.length) {
			System.arraycopy(this.a, this.a[0] , aa , aa[0] , a.length);
			a = aa;
			a[this.size]=x;
			System.out.println("������ "+x+"�� ������ �Ϸ�Ǿ����ϴ�.");
		}
		
		else {
			this.a[this.size] = x;
			this.size++;
			System.out.println("������ "+x+"�� ������ �Ϸ�Ǿ����ϴ�.");
		}
		}
	

	public void remove(int x) { 
		for(int i = 0; i < this.size; i++) { 
			if(a[i] == x) {
				for(int j = i; j < this.size-1; j++) {            
					a[j] = a[j + 1]; 
					
				} 
				System.out.println("������ "+ x +"�� ������ �Ϸ�Ǿ����ϴ�.");
				this.size--;
				break;
			} 
		} 
		
	} 
}



