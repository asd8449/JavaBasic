package loop;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 1;
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();

		for (int i = a; i >= 1; i--) {
			num *= i;			
		}
		System.out.printf("%d! = %d\n", a, num);
	}

}
