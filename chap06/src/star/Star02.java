package star;

import java.util.Scanner;

public class Star02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int x = a;
		for(int i = 0;i < x;i++) {
			for(int j = a;j != 0;j--) {
				System.out.print("*");
			}
			a--;
			System.out.println("");
		}
	}

}
