package chap03;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 1;
		int c = 1;
		
		for(a = 1;a < 10;a++) {
			for(b = 1;b < 10;b++) {
				for(c = 1;c < 10;c++) {
					if((a * a + b * b == c * c) && (a + b + c <= 20)) {
						System.out.printf("a = %d b = %d c = %d\n", a, b, c);
					}
				}
			}
		}
	}

}
