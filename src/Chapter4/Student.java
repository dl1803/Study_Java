package Chapter4;

public class Student {
	// Class attribute
	private String name;
	private int age;

	// Contructor
	public Student() {
		this.name = "";
		this.age = 0;
	}

	public Student(String name, int age) { // function overloading
		this.name = name;
		this.age = age;
	}

//	public String getName() {
//		return this.name;
//	}
//
//	public int getAge() {
//		return this.age;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
// Generate code setter/getter : Chuot phai vung trong -> Source -> Generate Setter/Getter -> chon pham vi public/... -> OK

	// Class method
	public void learnJava() {
		System.out.println("Learn Java with me !");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
