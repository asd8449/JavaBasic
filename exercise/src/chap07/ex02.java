package chap07;

public class ex02 {

	public static void main(String[] args) {

	}

}

interface Edible {
	void eat();
}

interface Sweetable {
	void sweet();
}

interface Delicious extends Edible, Sweetable{
	void eat();
	void sweet();
}