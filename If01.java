package select;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("세 개의 숫자를 입력하세요. : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(b > a)
			a = b;
		if(c > a)
			a = c;
		System.out.printf("가장 큰 수는 %d입니다.", a);
	}

}
