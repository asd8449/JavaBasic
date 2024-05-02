 package chap06;

public class ex05 {

	public static void main(String[] args) {
		Phone[] phones = {new Phone("황진이"), new TelePhone("길동이", "내일"), new SmartPhone("민국이", "갤러그")};
		for(Phone phone: phones) {
			 if(phone instanceof SmartPhone){
	                SmartPhone sp = (SmartPhone)phone;
	                sp.playGame();
	            }
	            else if(phone instanceof TelePhone){
	                TelePhone tp = (TelePhone)phone;
	                tp.autoAnswering();
	            }
	            else{
	                Phone p = (Phone)phone;
	                p.talk();
	            }
		}
	}

}

class Phone {
	protected String owner;

	Phone(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.printf("%s가 통화 중이다.\n", owner);
	}
}

class TelePhone extends Phone{
	private String when;

	TelePhone(String owner, String when) {
		super(owner);
		this.when = when;
	}

	void autoAnswering() {
		System.out.printf("%s가 없다. %s 전화 줄래.\n", owner, when);
	}
}

class SmartPhone extends Phone {
	private String game;
	
	SmartPhone(String owner, String game) {
		super(owner);
		this.game = game;
	}

	void playGame() {
		System.out.printf("%s가 %s 게임을 하는 중이다.\n", owner, game);
	}
}