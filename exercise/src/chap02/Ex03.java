package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14;
		
		System.out.print("원기둥의 밑면 반지름은? : ");
		int a = input.nextInt();
		System.out.print("원기둥의 높이는? : ");
		int b = input.nextInt();
		
		System.out.printf("원기둥의 부피는 %.1f", a * a * PI * b);
	}

}
