
public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint my = new MyPoint();
		my.setX(-1.0);
		my.setY(3.0);
		
		System.out.println("ÇöÀç ÁÂÇ¥ : ( "+ my.getX() +", "+ my.getY() +" )");
		my.moveTo(2, -5);
		System.out.println("ÇöÀç ÁÂÇ¥ : ( "+ my.getX()+", "+ my.getY() +" )");
		my.scaleTo(-2);
		System.out.println("ÇöÀç ÁÂÇ¥ : ( "+ my.getX() +", "+ my.getY() +" )");
		my.scaleTo(2);
		System.out.println("ÇöÀç ÁÂÇ¥ : ( "+ my.getX() +", "+ my.getY()  +" )");
	}

}
