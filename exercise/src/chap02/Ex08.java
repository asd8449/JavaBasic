package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 : ");
		int a = input.nextInt();
		
		System.out.printf("%d", a / 100 + (a % 100) / 10 + a % 10);

	}

}
