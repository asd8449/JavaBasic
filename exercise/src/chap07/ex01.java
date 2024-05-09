package chap07;

public class ex01 {

	public static void main(String[] args) {
		Concrete c = new Concrete(100, 50);
		c.show();
	}

}

abstract class Abstract{
	int i;
	Abstract(int i){
		this.i = i;
	}
	abstract void show();
}

class Concrete extends Abstract{
	int j;
	Concrete(int i, int j){
		super(i);
		this.j = j;
	}
	void show(){
		System.out.printf("i = %d, j = %d",i, j);
	}
}