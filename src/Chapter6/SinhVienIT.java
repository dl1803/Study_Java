package Chapter6;

public class SinhVienIT extends SinhVien {
	private String language;

	public void getMoney() {
		System.out.println("run get money");
		this.Infor(); // lop cha : duoc truy cap tu lop con -> super
		// dung super : neu con cung co ham tuong tu thi goi cha thay vi goi con
		// dung this: ___ goi con
	}

	public void Infor() {
		System.out.println("run infor from SinhVienIT");
	}

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax); // goi contructor cua cha : khi chua tao batki constructor nao thi no tu lay
										// constructor mac dinh
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "SinhVienIT [language=" + language + "]";
	}

}
