package array;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr = { 90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7 };

	double sum = 0;
	double average = 0;
	for(int i = 0;i < gradeArr.length;i++) {
		sum += gradeArr[i];
	}
	System.out.printf("합계 : %.1f\n", sum);
	System.out.printf("평균 : %.2f", sum / gradeArr.length);
	}

}
