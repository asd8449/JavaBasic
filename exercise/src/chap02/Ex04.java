package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요. : ");
		int a = input.nextInt();
		int b = a / 60;
		int c = b / 60;
		a = a % 60;
		b = b % 60;
		System.out.printf("%d시간 %d분 %d초", c, b, a);
		
	}

}
