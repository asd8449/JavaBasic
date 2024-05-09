package chap07;

public class ex05 {

	public static void main(String[] args) {
		Controller[] c = {new TV(false), new Radio(true)};

		for(Controller cont : c) {
			cont.show();
		}
	}

}

abstract class Controller {
	boolean power;
	Controller(boolean power){
		this.power = power;
	}
	void show() {
		if(this.power)
			System.out.printf("켜졌습니다.\n");
		else
			System.out.printf("꺼졌습니다.\n");
	}
	
	abstract String getName();
}

class TV extends Controller{
	private String name = "TV";
	TV(boolean power){
		super(power);
	}
	
	void show() {
		if(super.power)
			System.out.printf("%s가 켜졌습니다.\n", name);
		else
			System.out.printf("%s가 꺼졌습니다.\n", name);
	}
	String getName() {
		return name;
	}
}

class Radio extends Controller{
	private String name = "라디오";
	Radio(boolean power){
		super(power);
	}
	
	void show() {
		if(super.power)
			System.out.printf("%s가 켜졌습니다.\n", name);
		else
			System.out.printf("%s가 꺼졌습니다.\n", name);
	}
	String getName() {
		return name;
	}
}