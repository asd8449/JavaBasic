package loop;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = input.nextInt();
		System.out.printf("[ 구구단 %d단 ]\n",a);
		for(int i = 1;i < 10;i++)
			System.out.printf("%d x %d = %d\n", a, i, a * i);
	}

}
