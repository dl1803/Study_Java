package learnjava.java_basic;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("run Bai01");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		float gpa = in.nextFloat();
		System.out.println(name + " co diem = " + gpa);

		if (gpa > 5) {
			System.out.println("Qua mon");
		} else {
			System.out.println("Rot mon");
		}
		in.close();
	}
}
