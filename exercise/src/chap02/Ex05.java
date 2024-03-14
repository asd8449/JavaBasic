package chap02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("무작위 영어 소문자를 입력하세요 : ");
		char a = input.nextLine().charAt(0);
		 int b = (int)a;
		 b = b - 32;
		 char c = (char)b;
		
		System.out.println(c);
	}

}
