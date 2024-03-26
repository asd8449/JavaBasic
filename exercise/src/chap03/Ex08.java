package chap03;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

	public static int factorial(int n) {
		
		int fac = 1;
		
		switch(n) {
		case 5:
			fac *= n--;
		case 4:
			fac *= n--;
		case 3:
			fac *= n--;
		case 2:
			fac *= n--;
		default :
			return fac;
		}
	}

}
