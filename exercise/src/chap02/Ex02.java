package chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int a = input.nextInt();
		System.out.printf("%d의 제곱은 %d", a, a*a);
	}

}
