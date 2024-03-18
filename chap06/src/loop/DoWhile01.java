package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int sum = 0;
		do {
			System.out.print("숫자를 입력하세요 : ");
			a = input.nextInt();
			sum += a;
		}while(a != 0);
	System.out.printf("지금까지 입력한 숫자의 합은 %d입니다.", sum);
	
	}

}
