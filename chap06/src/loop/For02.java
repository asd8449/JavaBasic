package loop;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x, y = 0;
		System.out.println("5개의 숫자를 입력하세요.");
		for(int i = 0;i < 5;i++) {
			x = input.nextInt();
			y += x;
		}
		System.out.printf("5개 숫자의 합은 %d입니다.", y);
	}

}
