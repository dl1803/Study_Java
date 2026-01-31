package Lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		boolean check = true;
		if (x < 2) {
			System.out.printf("%d khong la so nguyen to", x);
			System.exit(0);
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				check = false;
			}
		}
		if (!check)
			System.out.printf("%d khong la so nguyen to", x);
		else
			System.out.printf("%d la so nguyen to", x);
	}
}
