package learnjava.java_basic;

import java.util.Arrays;

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
		/* System.exit(0); -> thoat han chuong trinh : <=> return 0; */
		/* sysout("%.3f ", x ) -> dinh dang thap phan */

//		Nếu nhập vào 1 => in ra "Bạn đã lựa chọn phép cộng" 
//		Nếu nhập vào 2 => in ra "Bạn đã lựa chọn phép trừ" 
//		Nếu nhập vào 3 => in ra "Bạn đã lựa chọn thoát chương trình" => System.exit(0);
		String[] clubs = { "MU", "Man", "Liverpool" };
		System.out.println("run here with length = " + clubs.length);
		System.out.println("run here " + Arrays.toString(clubs));
		int[] a = { 1, 6, 2, 5, 1 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
//			System.out.println(clubs[i]);
			System.out.println(a[i]);
		}
	}
}
