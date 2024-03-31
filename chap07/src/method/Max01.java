package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int max;
		int a[] = new int[] { 1, 1, 1 };
		while (true) {
			System.out.print("세 개의 숫자를 입력하세요 : ");
			StringTokenizer x = new StringTokenizer(bf.readLine(), " ");
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(x.nextToken());
			}
			max = getMax(a[0], a[1], a[2]);
			if(max == 0)
				break;
			System.out.println("최대값은" + max + "입니다.");
		}
	}

	public static int getMax(int a, int b, int c) {
		int max = a;
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		return max;
	}
}
