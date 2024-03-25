package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		int y[] = new int [x];
		int sum = 0;
		StringTokenizer z = new StringTokenizer(bf.readLine(), " ");
		
		for(int i = 0;i < x;i++) {
			y[i] = Integer.parseInt(z.nextToken());
			sum += y[i];
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f", ((double)sum)/x);
	}

}
