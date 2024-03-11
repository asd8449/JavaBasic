package scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14;
		System.out.print("원의 반지름을 입력하세요(cm) : ");
		int i = input.nextInt();
		System.out.printf("원의 넓이는%.1fcm입니다.", PI * i * i);

	}

}
