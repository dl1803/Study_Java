package Chapter4;

public class TestChap4 {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
//		System.out.println("run chap4");
//		Student st1 = new Student(); //contructor
//		st1.name = "Duc Loi";
//		st1.age = 20;
//		System.out.println("student with name " + st1.name + " and age " + st1.age);
		TestChap4 test = new TestChap4();
		int kq = test.sum(6, 9);
		System.out.println("Check sum = " + kq);
	}
}
