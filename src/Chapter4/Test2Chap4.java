package Chapter4;

public class Test2Chap4 {

	public static void main(String[] args) {
		System.out.println("run Test2Chap4");
		Student st1 = new Student();
		Student st2 = new Student("Duc Loi", 20);
		st1.setName("Tom");
		System.out.println("check obj with name: " + st1.getName() + " and age: " + st1.getAge());
		System.out.println("check obj with name: " + st2.getName() + " and age: " + st2.getAge());
	}
}
