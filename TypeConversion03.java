package sec04;

public class TypeConversion03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		double y = 3.0;
		long l;
		int i;
		
		l = (long)y;
		i = (int)l;
		
		System.out.println(x / y);
		System.out.println(i);
	}

}
