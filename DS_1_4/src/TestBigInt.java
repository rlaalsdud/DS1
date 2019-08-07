
public class TestBigInt {

	public static void main(String[] args) {
		
		BigInt x = new BigInt(54321);
		BigInt y = new BigInt(9);
		BigInt z = new BigInt(8888);
		 
		x.multiplyone(y);
		System.out.println("[ x : "+ x +" , y : "+ y +" ]");
		System.out.println("- x.multiplyone(y) = "+ x.multiplyone(y) );
		System.out.println();
		
		x.multiply(z);
		System.out.println("[ x : "+ x +" , z : "+ z +" ]");
		System.out.println("- x.multiply(z) = "+ x.multiply(z));
		System.out.println("- z.multiply(x) = "+ z.multiply(x));
		System.out.println();
		
		BigInt x1 = new BigInt(8888);
		BigInt z1 = new BigInt(54321);
		x1.multiply(z1);
		System.out.println("[ x : "+ x1 +" , z : "+ z1 +" ]");
		System.out.println("- x.multiply(z) = "+ x.multiply(z));
		System.out.println("- z.multiply(x) = "+ z.multiply(x));
		
		
	}

}
