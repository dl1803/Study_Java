package Chapter9;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		// c1:
//		Scanner in = new Scanner(System.in);
		System.out.print("Nhap x = ");
//		try {
//			int x = in.nextInt();
//			System.out.println("run try");
//		} catch (Exception e) {
//			// TODO: handle exception'
//			System.out.println("run catch");
//
//		} finally {
//			// TODO: handle finally clause
//			System.out.println("run finally");
//			in.close();
//		}

		// c2 : try-with-resources : voi scanner : khi chay xong no tu dong dung
		// in.close() de kh bi leak => hieu nang cao hon
		// hay voi cac cu phap de bi leak khi khai bao ma quen dong : vi du nhu mo
		// file,...
		try (Scanner in = new Scanner(System.in);) {
			int x = in.nextInt();
		}
	}
}
