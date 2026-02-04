package Chapter7;

public class TestPolymorphismSV {
	public static void main(String[] args) {
		SinhVien st1 = new SinhVienIT("1", "Duc Loi", 150, 20, "java", 8.5, 9.5);
		// st1.getMoney(); // super -> goi cua cha ; this trong con -> goi con
		System.out.println("st1 check = " + st1 + " voi diem = " + st1.getDiem());
		SinhVien st2 = new SinhVienCoKhi("2", "Tran Loi", 120, 30, "machine", 8, 10);
		System.out.println("st2 check = " + st2 + " voi diem = " + st2.getDiem());
	}
}
