package chap03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		if(a >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");

	}

}
