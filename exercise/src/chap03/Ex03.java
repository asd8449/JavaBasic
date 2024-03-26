package chap03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int a, b = 0;
		
		do {
			a = input.nextInt();
			if(a % 2 == 0)
				b += a;
		}while(a > 0);
		System.out.println(b);

	}

}
