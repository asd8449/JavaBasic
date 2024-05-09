package chap07;

public class ex04 {

	static void speak(Talkable t) {
		t.talk();
	}
	
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}

interface Talkable {
	void talk();
}

class Korean implements Talkable {
	String hi = "안녕하세요!";
	public void talk() {
		System.out.println(hi);
	}
}

class American implements Talkable {
	String hi = "Hello!";
	public void talk() {
		System.out.println(hi);
	}
}