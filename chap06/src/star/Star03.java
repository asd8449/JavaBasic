package star;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int x = a;
		for (int i = 0; i < x; i++) {
			for (int j = 1; j <= x; j++) {
				if (a > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			a--;
			System.out.println("");
		}

	}

}