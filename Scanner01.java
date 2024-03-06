package sec04;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 타입 숫자를 입력하세요 : ");
		int x = input.nextInt();
		System.out.print("실수 타입 숫자를 입력하세요 : ");
		double y = input.nextDouble();
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}

}
