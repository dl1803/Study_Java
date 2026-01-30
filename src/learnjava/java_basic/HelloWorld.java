package learnjava.java_basic;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		 * Goi y code -> Ctrl + Space - vd : main + ctrl + space + enter / sysout + ___
		 * ....
		 */
		/*
		 * Chay chuong trinh : C1: Chuot phai tep java -> Run as -> 1 C2: Chuot phai tep
		 * java -> properties -> mo tren Window Explorer -> go cmd lên thanh timkiem de
		 * mo cd -> go java <ten tep java.java>
		 */
		/*
		 * Phim tat : Ctrl + F11
		 */
		/*
		 * Format code : C1: chon vung code can format -> chuot phai -> source -> format
		 * C2(uu tien): Ctrl + S -> auto format (can cau hinh: Window → Preferences ->
		 * Java → Editor → Save Actions -> Perform the selected actions on save Format
		 * source code )
		 */
		/* Tương tự C/C++ */
		/*
		 * Xuat : printf -> chi in , khong auto xuong dong, co the dung \n de xuong dong
		 * println -> tu dong xuong dong (u tien dung)
		 */
		/*
		 * //in ra kết quả có định dạng: print format System.out.printf( ); %d: số
		 * nguyên %f: số thực - mặc định là 6 số lẻ %.3f định dạng 3 số lẻ %.0f lam tron
		 * so ; %s: chuỗi
		 */
		Scanner in = new Scanner(System.in);
		int tax = in.nextInt();
		if (tax < 10) {
			System.out.println("Khong dong thue");
		} else if (tax >= 10 && tax < 15) {
			System.out.println("Thue 10%");
		} else if (tax >= 15 && tax < 30) {
			System.out.println("Thue 20%");
		} else {
			System.out.println("Thue 50%");
		}
		in.close();

	}
}
