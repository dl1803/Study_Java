package Chapter7;

public abstract class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public SinhVien() { // de SinhVienCoKhi khong loi khi khong tao constructor

	}

	// Phai -> Source -> Generate Constructor using field
	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void Infor() {
		System.out.println("run infor from parent");
	}

	abstract double getDiem();
}