package Chapter7;

public class SinhVienCoKhi extends SinhVien {
	private String skill;
	private double scoreCNC;
	private double scorePLC;

	// Phai -> Source -> Generate super class
	public SinhVienCoKhi(String id, String name, double price, double tax, String skill, double scCNC, double scPLC) {
		super(id, name, price, tax);
		this.skill = skill;
		this.scoreCNC = scCNC;
		this.scorePLC = scPLC;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (scoreCNC + scorePLC) / 2;
	}

	@Override
	public String toString() {
		return "SinhVienCoKhi [skill=" + skill + ", scoreCNC=" + scoreCNC + ", scorePLC=" + scorePLC + "]";
	}

}