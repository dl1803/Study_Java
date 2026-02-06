package Chapter9;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		System.out.print("Nhap x = ");
		Scanner in = new Scanner(System.in);
		boolean err = true;
		while (true) {
			try { // xu li nhap sai KDL
				int x = in.nextInt();
				try { // xu li /0
					if (!err)
						break;
					System.out.printf("Ket qua 10/%d = " + 10 / x, x);
					err = false;
				} catch (Exception e) {
					System.out.println("run error with x = " + x);
					err = true;
					System.out.print("Nhap lai : ");
				}
			} catch (Exception e) {
				in.next(); // doi voi scanner neu nhap sai se bi lap vo han trong while -> dung .next() de
							// kh bi , khong dung continue gay lap vo tan
				System.out.print("Loi ! Nhap lai : ");
			}
		}
	}
}
