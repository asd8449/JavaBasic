package method;

public class NineNine01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2;i < 10;i++) {
			nine(i);
		}
	}

	public static void nine(int a) {
		System.out.printf("[ 구구단 %d단 ]\n", a);
		for(int j = 1;j < 10;j++) {
			System.out.printf("%d x %d = %d\n", a, j, a * j);
		}
	}
	
}
