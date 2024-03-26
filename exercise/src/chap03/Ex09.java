package chap03;

public class Ex09 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	public static void foo(String a, int b) {
		System.out.printf("%c %d", a, b);
	}
	public static void foo(String a, int b, int c) {
		System.out.printf("%c %d %d", a, b, c);
	}
	public static void foo(String a) {
		System.out.printf("%c", a);
	}
}
