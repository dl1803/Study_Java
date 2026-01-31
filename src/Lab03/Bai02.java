package Lab03;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap 1 so nguyen bat ky: ");
		int x = in.nextInt();
		System.out.printf("---BANG CUU CHUONG %d---\n", x);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("       %d x %d = %d \n", x, i, x * i);
		}
	}
}
