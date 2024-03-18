package star;

import java.util.Scanner;

public class Star06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int x = a;
		int y = a;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < (x+y-1); j++) {
				if (i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			a--;
			x--;
			System.out.println("");
		}

	}

}