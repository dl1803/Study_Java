package Chapter6;

public class Student {
	private String name;
	private String id;

	public Student() {
		count++;
	};

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		count++;
	}

	public void xuatThongTin() {
		System.out.println("Ten cua sv: " + this.name + " - id: " + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private static int count = 0;

	public static int getCount() {
		return count;
	}

	@Override // Phải -> Source -> Generate to String : ghi đè hàm toString:
	// -> dung de in thang mang doi tuong : sysout(arr)
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
