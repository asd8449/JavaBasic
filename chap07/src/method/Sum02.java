package method;

import java.util.Scanner;

public class Sum02 {
	
	public static int getNumberKeyboard(String message) {
		System.out.print(message);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static int printSum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void printScreen(int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		while ((num = getNumberKeyboard("양의 숫자를 입력하세요 :")) > 0) {
			int result = printSum(num);
			printScreen(result);
		}
		System.out.println("다음에 또 봐요~~~~");
	}



}