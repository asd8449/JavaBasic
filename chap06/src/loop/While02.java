package loop;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a, b = 0;
		System.out.print("숫자를 입력하세요 : ");
		a = input.nextInt();
		b += a;
		
		while(a != 0) {
		System.out.print("숫자를 입력하세요 : ");
		a = input.nextInt();
		b += a;
		}
		System.out.printf("지금까지 입력한 숫자의 합은 %d입니다.",b);
	}

}
