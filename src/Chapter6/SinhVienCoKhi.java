package Chapter6;

public class SinhVienCoKhi extends SinhVien {
	private String skill;

	// Phai -> Source -> Generate super class
	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this.skill = skill;
	}

}
