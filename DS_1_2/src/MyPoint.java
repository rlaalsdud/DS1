
public class MyPoint implements Point{
	private double x;
	private double y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public void setX(double x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	public void setY(double y) {
		// TODO Auto-generated method stub
		this.y = y;
	}

	@Override
	public void moveTo(double a, double b) {
		// TODO Auto-generated method stub
		x = x + a;
		y = y + b;
		System.out.println("[move] x축으로 "+ a +", y축으로 "+ b +"만큼 이동 완료 하였습니다.");
	}

	@Override
	public void scaleTo(double c) {
		// TODO Auto-generated method stub
		if(c <= 0) {
			System.out.println("[Error] 입력하신 " + c +"는 양수가 아니므로 조건에 어긋납니다.");
		}
		else {
			x = x * c;
			y = y * c;
			System.out.println("[scale] 좌표에 "+ c +"배를 하였습니다.");
		}
	}

	

}
