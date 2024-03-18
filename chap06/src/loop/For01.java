package loop;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		int x = 0;
		for(int i = 0;i <= a;i++)
			x += i;
		System.out.printf("1부터 %d까지의 합은 %d입니다.",a, x);
	}

}
