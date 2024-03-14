package select;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		a %= 2;
		switch(a) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
		}
	}

}
