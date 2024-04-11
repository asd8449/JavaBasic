package chap04;

class Printer {
	private int numOfPaper;
	private boolean duplex;
	private String pt = duplex ? "양면" : "단면";
	public Printer(int numOfPaper) {
		this.numOfPaper = numOfPaper;
	}

	public void print(int amount) {
		if(duplex)
			amount /= 2;
		if (numOfPaper == 0)
			System.out.println("용지가 없습니다.\n");
		else if (numOfPaper < amount) {
			System.out.printf("%s으로 모두 출력하려면 용지가 %d장 부족합니다. %d장만 출력합니다.\n", pt, amount - numOfPaper, numOfPaper);
			numOfPaper = 0;
		} else {
			numOfPaper -= amount;
			System.out.printf("%s으로 %d장 출력했습니다. 현재 %d장 남아있습니다.\n", pt, amount, numOfPaper);
		}
	}
	
	public boolean getDuplex() {
		System.out.println(pt);
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		printDuplex();
		this.duplex = duplex;
	}
	
	public void printDuplex() {
		System.out.println("true : 양면 | false : 단면");
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printer pr = new Printer(10);
		pr.print(2);
		pr.print(20);
		pr.print(10);
	}
}
