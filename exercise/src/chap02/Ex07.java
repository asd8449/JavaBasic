package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b;
		
		System.out.print("정수 입력 : ");
		int a = input.nextInt();

			System.out.println(a % 4 == 0 && a % 5 == 0);

			System.out.println(a % 4 == 0 || a % 5 == 0);

			System.out.println(!(a % 4 == 0 && a % 5 == 0));

	}

}