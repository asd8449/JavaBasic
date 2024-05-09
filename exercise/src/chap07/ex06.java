package chap07;

public class ex06 {

	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		p.print(); 
		p.eat();
	}

}

interface Human {
	void eat();

	void print();

	static void echo() {
		System.out.println("야호!!!");
	}
}

class Worker implements Human {
	public void print() {
		System.out.println("인간입니다.");
	}
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
}

class Student implements Human {
	int age;
	Student(int age){
		this.age = age;
	}
	
	public void print() {
		System.out.printf("%d세의 학생입니다.\n", age);
	}
	
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
}