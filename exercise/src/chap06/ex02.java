package chap06;

public class ex02 {

	public static void main(String[] args) {
		Person person[] = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("Amy", 30, 200, "U.S.A")};
		for(Person p : person) {
			System.out.println(p.show());
		}
	}

}
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String show() {
		return "사람[이름 : " + name + ", 나이 : " + age + "]";
	}
	
}

class Student extends Person {
	int classOf;
	public Student(String name, int age, int classOf) {
		super(name, age);
		this.classOf = classOf;
	}
	
	public int getClassOf() {
		return classOf;
	}
	public String show() {
		return "사람[이름 : " + name + ", 나이 : " + age +", 학번 : " + classOf + "]";
	}
}

class ForeignStudent extends Student {
	String contry;
	public ForeignStudent(String name, int age, int classOf, String contry) {
		super(name, age, classOf);
		this.contry = contry;
	}
	public String getContry() {
		return contry;
	}
	public String show() {
		return "사람[이름 : " + name + ", 나이 : " + age +", 학번 : " + classOf + ", 국적 : " + contry + "]";
	}
}