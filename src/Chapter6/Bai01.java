package Chapter6;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		System.out.println("Nhap vao username: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Nhap vao password: ");
		String pass = in.nextLine();
		if (name.equals("hoidanit") && pass.length() > 6) {
			System.out.println("Account hop le !");
		} else {
			System.out.println("Account khong hop le. Vui long nhap lai !");
		}
	}
}
