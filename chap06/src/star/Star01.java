package star;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int x = a;
		int y = 1;
		for(int i = 0;i < x;i++) {
			for(int j = y;j != 0;j--) {
				System.out.print("*");
			}
			y++;
			System.out.println("");
		}
	}

}
