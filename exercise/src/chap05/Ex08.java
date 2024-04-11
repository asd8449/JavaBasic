package chap05;

public class Ex08 {

	public static void main(String[] args) {

		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());

	}

}

class Dice{
	private int face;
	
	public int roll() {
		return setFace((int)(Math.random() * 6 + 1));
	}

	public int getFace() {
		return face;
	}

	public int setFace(int face) {
		if(face < 1 || face > 6)
			return 0;
		this.face = face;
		return face;
	}
}