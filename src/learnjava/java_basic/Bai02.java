package learnjava.java_basic;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Nhap chieu dai hinh chu nhat: ");

		float cd = in.nextFloat();

		System.out.println("Nhap chieu rong hinh chu nhat: ");
		float cr = in.nextFloat();

		System.out.println("Chu vi hinh chu nhat: " + (cd + cr) * 2);
		System.out.println("Dien tich hinh chu nhat: " + cd * cr);
		System.out.println("Canh nho nhat: " + Math.min(cd, cr));

		in.close();
	}

}
