package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array03 {
	
	public static int getNumKeyboard(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		return Integer.parseInt(br.readLine());
	}
	
	public static int[] getScoresLine(int num) throws IOException {
		int[] scores = new int[num];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 성적 입력 : ");
		String str = br.readLine();
		StringTokenizer z = new StringTokenizer(str, " ");
		for(int i = 0;i < num;i++) {
			scores[i] = Integer.parseInt(z.nextToken());
		}
		return scores;
	}

	public static void printSumAverage (int[] sc) {
		int sum = 0;
		for(int i = 0;i < sc.length;i++) {
			sum += sc[i];
		}
		double avg = sum / sc.length;
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f", avg);
	}
	
	public static void main(String[] args) throws IOException {
		int numStudent = getNumKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}

}
