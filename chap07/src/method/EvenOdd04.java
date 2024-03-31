package method;

import java.util.Scanner;

public class EvenOdd04 {

	public static int getNumberKeyboard(String message) {
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		return input.nextInt();
	}
	
	public static int decideEvenOdd(int num) {
		return num % 2;
	}
	
	public static void printResultScreen(int flag) {
		if(flag ==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}
	
	public static boolean isContinue() {
		int i = getNumberKeyboard("계속 하시겠습니까?(1 : 예 / 2 : 아니오) : ");
		if(i == 0) 
			return false;
			
		else 
			return true;
	}
	
	public static void main(String[] args) {
		do {
			int num = getNumberKeyboard("숫자를 입력하세요 : ");
			int result = decideEvenOdd(num);
			printResultScreen(result);
		} while (isContinue());
	}

}
