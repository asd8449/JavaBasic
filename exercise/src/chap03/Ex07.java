package chap03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("철수 : ");
		String a = input.next();
		System.out.print("영희 : ");
		String b = input.next();
		whosWin(a, b);
		
	}
	
	public static void whosWin(String c, String y) {
		if(c.equals(y))
			System.out.println("무승부");
		else if(c.equals("r")) {
			if(y.equals("p"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		}else if(c.equals("s")) {
			if(y.equals("r"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		}else {
			if(y.equals("s"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		}
	}
}
