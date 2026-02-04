package Chapter8;

public class TestInterface {
	public static void main(String[] args) {
		Student st1 = new Student("1", "Duc Loi", 20, 10);
		System.out.println("st1 check = " + st1);
		st1.setGrade();
		System.out.println("st1 check = " + st1);

		Person p1 = new Person("2", "Quy", 20);
		System.out.println("p1 check = " + p1);
		p1.input();
		p1.display();
	}
}
