package Chapter6;

public class TestInheritance {
	public static void main(String[] args) {
		SinhVienIT st1 = new SinhVienIT("1", "Duc Loi", 150, 20, "java");
		// st1.getMoney(); // super -> goi cua cha ; this trong con -> goi con
		System.out.println("st1 check = " + st1.name);
		SinhVienIT st2 = new SinhVienIT("2", "Tran Loi", 120, 30, "machine");
		System.out.println("st2 check = " + st2.name);
	}
}
