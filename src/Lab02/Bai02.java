package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void giaiPTBacNhat(int a, int b) {
		double x;
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			x = 1.0 * -b / a;
			System.out.printf("Gia tri x = %.3f", x);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double x;
		double delta;
		if (a == 0) {
			giaiPTBacNhat(b, c);
		} else {
			delta = Math.pow(b, 2) - 4 * a * c * 1.0;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep x = " + -b / (a * 2.0));
			} else {
				System.out.println("Phuong trinh co 2 nghiem phan biet : ");
				System.out.println("Nghiem thu nhat x1 = " + (-b + Math.sqrt(delta)) / (2.0 * a));
				System.out.println("Nghiem thu hai x2 = " + (-b - Math.sqrt(delta)) / (2.0 * a));
			}
		}
		in.close();
	}
}
