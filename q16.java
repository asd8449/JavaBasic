package AISW;

import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		npria(input.nextInt());
	}

	static void npria(int n) {
		for(int i = 1;i <= n;i++) {
			for(int k = i;k < n;k++) {
				System.out.print(" ");
			}
			for(int j = 1;j <= i*2-1;j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
}
