
public class BigInt {

	private Node start;
	
	private static class Node{
		int digit;
		Node next;
		Node(int digit) {this.digit = digit;}
	}
	
	public BigInt(int n) {
		if(n < 0) throw new IllegalArgumentException(n + "<0");
		start = new Node(n % 10);
		Node p = start;
		n /= 10;
		while(n > 0) {
			p = p.next = new Node(n % 10);
			n /= 10;
		}
	}
	public String toString() {
		StringBuffer buf = new StringBuffer(Integer.toString(start.digit));
		Node p = start.next;
		while(p != null) {
			buf.insert(0, Integer.toString(p.digit));
			p = p.next;
		}
		return buf.toString();
	}
	public BigInt plus(BigInt y) {
		Node p = start;
		Node q = y.start;
		int n = p.digit + q.digit;
		BigInt z = new BigInt(n%10);
		Node r= z.start;
		p = p.next;
		q = q.next;
		
		while(p != null && q != null) {
			n = n/10 + p.digit + q.digit;
			r.next = new Node(n%10);
			p = p.next;
			q = q.next;
			r = r.next;
		}
		while(p != null) {
			n = n / 10 + p.digit;
			r.next = new Node(n%10);
			p = p.next;
			r = r.next;
		}
		while(q != null) {
			n = n/10 + q.digit;
			r.next = new Node(n%10);
			q = q.next;
			r = r.next;
		}
		if(n > 9) r.next = new Node(n/10);
		
		return z;
	}
	public BigInt multiplyone(BigInt y) { //y가 한 자리 양의 수 일 때
		Node p = start;
		Node q = y.start;
		int n = p.digit * q.digit;
		BigInt z = new BigInt(n % 10);
		Node r = z.start;
		p = p.next;
		
		while(p != null) {
			n = n/10 + p.digit*q.digit;
			r.next = new Node(n%10);
			p = p.next;
			r = r.next;
		}
		if(n > 9) r.next = new Node(n/10);
		return z;
	}
	public BigInt multiply (BigInt z) {
		Node q= z.start; //일의 자리수
		BigInt y = new BigInt(q.digit); //곱할 거 첫 번째 숫자
		BigInt a = new BigInt(1); //곱하고 나서 합
		BigInt b = new BigInt(0); // 곱하고 나온 거
		
		Node p = new Node(0); // 0 노드를 가리키는 노드p를 만든다. 
		
		
		a = multiplyone(y);
		
		q = q.next;
		y = new BigInt(q.digit); 
		b = multiplyone(y);
		
		p.next = b.start; 
		b.start = p; 
		
		a = a.plus(b);
		
		q = q.next;
		
		int i = 1;
		
		while(q!=null) {
			i++;
			
			y = new BigInt(q.digit);
			b = multiplyone(y);
			
			for(int j=0; j < i; j++) {
				p = new Node(0);
				Node w = b.start;
				p.next = b.start;

				w = p;
				b.start = w;
				
			}
					
			a = a.plus(b);
			q = q.next;
		}

		return a;
	}
}
