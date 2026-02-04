package Chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class BadyDog extends Dog {
	void eat() {
		System.out.println("BadyDog is eating...");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		System.out.println("run Polymorphism");
		Animal a = new BadyDog(); // KDL ben trai kh quan trong - new Doi tuong -> auto convert
		// quan trong KDL ben phai (duoc ep kieu)
		// ban dau cu khai bao cha -> neu biet duoc muc dich thi ep kieu sang
		a.eat(); // method abstract : di tu con -> cha -> ong noi
	}
}
