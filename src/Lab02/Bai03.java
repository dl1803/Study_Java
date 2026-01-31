package Lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sodien = in.nextInt();
		int tiendien = 0;
		if (sodien >= 0 && sodien <= 100) {
			tiendien = sodien * 1000;
		} else if (sodien > 100) {
			tiendien = (sodien - 100) * 1500 + 100 * 1000;
		}
		System.out.println("Tien dien = " + tiendien + " VND");
	}
}
