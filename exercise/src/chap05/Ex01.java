package chap05;

public class Ex01 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		System.out.println(t1.findArea());		
	}

}

class Triangle{
	private double a;//밑변
	private double b;//높이
	
	public Triangle(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double findArea() {
		return (a * b) / 2;
		//밑변 * 높이 / 2
	}
	
	public boolean isSameArea(Triangle tr) {
		return this.findArea() == tr.findArea();
	}
	
	public double geta() {
		return a;
	}
	
	public double getb() {
		return b;
	}
	
	public void seta(double a) {
		this.a = a;
	}
	
	public void setb(double b) {
		this.b = b;
	}
}