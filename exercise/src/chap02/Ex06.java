package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨(F)온도를 입력해주세요. : ");
		
		double a = input.nextDouble();
		double b;
		b = (a - 32) / 1.8;
		
		System.out.printf("%.0ff는 %fC입니다. ",a, b);
	}

}
