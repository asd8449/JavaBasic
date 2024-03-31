package method;

import java.util.Scanner;

public class EvenOdd03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int x = 1;
		while (x == 1) {
			System.out.print("숫자를 입력하세요 : ");
			int a = input.nextInt();
			
			System.out.printf("%s입니다.\n", decideEvenOdd(a));
			
			System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			x = input.nextInt();
		}
	}

	public static String decideEvenOdd(int i) {
		Scanner input = new Scanner(System.in);
		
		if (i % 2 == 0)
			return "짝수";
		else
			return "홀수";

	}
}
