package method;

import java.util.Scanner;

public class Sum01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		while((a = input.nextInt()) > 0) {
			System.out.print("양의 숫자를 입력하세요 : ");
			sum = s(a, sum);

		}
		System.out.println("다음에 또 봐요~~~");
	}

	public static int s(int i, int sum) {
		sum += i;
		System.out.println(sum);
		return sum;

	}
	
}
