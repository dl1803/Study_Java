package Lab02;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất             ");
		System.out.println("| 2. Giải phương trình bậc hai             ");
		System.out.println("| 3. Tính số tiền điện                      ");
		System.out.println("| 4. Kết thúc                              ");
		System.out.println("++ ------------------ ++");
		System.out.println("Lựa chọn của bạn là : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			// Viet ham giaiPTBacNhat (Bai01)
			break;
		case 2:
			// Viet ham giaiPTBacHai (Bai02)
			break;
		case 3:
			// Viet ham tinh sotiendien (Bai03)
			break;
		default:
			System.out.println("Bạn đã lựa chọn thoát chương trình");
			System.exit(0);
		}
		scanner.close();
	}
}
