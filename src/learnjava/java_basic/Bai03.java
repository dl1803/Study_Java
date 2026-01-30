package learnjava.java_basic;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Nhap vao canh khoi lap phuong: ");
		Scanner in = new Scanner(System.in);

		double canh = in.nextDouble();

		System.out.println("The tich khoi lap phuong = " + Math.pow(canh, 3));
		in.close();
	}
}
