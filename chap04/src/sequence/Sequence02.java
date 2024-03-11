package sequence;

import java.util.Scanner;

public class Sequence02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("금액을 입력하세요(원):");
		int x = input.nextInt();
		
		a = x / 500;
		b = (x % 500) / 100;
		System.out.printf(">>500원 동전 %d개와 100원 동전 %d개가 필요합니다.", a, b);

	}

}
