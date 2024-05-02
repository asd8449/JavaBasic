package chap06;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "x좌표 : " + x + " y좌표 : " + y;
	}
}
class MovablePoint extends Point{
	private int xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	public String toString() {
		return super.toString() + "x좌표 이동 속도 : " + xSpeed + "y좌표 이동 속도 : " + ySpeed;
	}
}