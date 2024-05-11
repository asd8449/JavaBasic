package countable;

public class Bird extends Countable {
	
	
	
	Bird(String name, int num) {
		super(name, num);
	}
	void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n", num, name);
	}
	@Override
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n", name, num);
	}

}
