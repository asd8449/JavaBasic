package chap05;

public class Ex03 {
	public static void main(String[] args) {
		User user = new User("홍길동", "ghdrlfehd1", "rlfehd1212", 23);
		
	}
}

class User {
	private String name;
	private String ID;
	private String PW;
	private int age;

	User(String name, String ID, String PW, int age) {
		this.setName(name);
		this.setID(ID);
		this.setPW(PW);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}
}