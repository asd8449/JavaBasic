package loop;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2;i < 10;i++) {
			System.out.printf("[ 구구단 %d단 ]\n", i);
			for(int j = 1;j < 10;j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
	}

}
