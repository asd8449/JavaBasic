package classtest;

import java.util.Scanner;

public class CircleDemo01 {

	public static void main(String[] args) {
		System.out.print("원의 반지름 : ");
		Scanner in = new Scanner(System.in);
		Circle cle = new Circle(in.nextDouble());
		cle.getArea();
		cle.show();
	}

	
	
}


class Circle {
	private double radius;
	private double area;
	final double PI = 3.14;
	
	void getArea() {
		area = PI * radius * radius;
	}
	void show() {
		System.out.printf("반지름 = %.2f, 면적 = %.2f",radius, area);		
	}

	public Circle(double radius){
		this.radius = radius;
	}
	
	
}

class CircleNew {
	private double radius;
	final double PI = 3.14;
	
	CircleNew() {
	}
	
	CircleNew(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return PI * radius * radius;
	}
	
	void show(double radius, double area) {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
}
