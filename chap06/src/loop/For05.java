package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		System.out.print("양의 숫자를 입력하세요 : ");
		while (true) {
			a = input.nextInt();
			if (a <= 0) {
				System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
				continue;
			}
			for(int i = 0;i <= a;i++) {
				sum += i;
			}
			break;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", a, sum);
	}

}
