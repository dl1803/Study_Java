package Chapter6;

import java.util.ArrayList;

public class Bai02 {

	public static void main(String[] args) {
		// string.substring(start, end) ; start tính từ 0 (có lấy) ; end không lấy
		ArrayList<Student> s = new ArrayList();
		s.add(new Student("Trần Loi", "1"));
		s.add(new Student("Nguyễn Loi", "2"));
		s.add(new Student("Lê Loi", "3"));
		String tenBD = "Nguyễn";
		for (int i = 0; i < Student.getCount(); i++) { // s.size()
			if (s.get(i).getName().substring(0, 6).equals(tenBD)) { // startsWith("Nguyễn") -> kiểm tra chuỗi có BẮT ĐẦU
																	// bằng một chuỗi khác hay không.
				System.out.println("Sinh viên có tên bắt đầu là \"Nguyễn\" là sinh viên thứ" + (i + 1) + "có tên :"
						+ s.get(i).getName() + "- id: " + s.get(i).getId());
			}
		}
	}
}
