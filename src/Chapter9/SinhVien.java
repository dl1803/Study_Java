package Chapter9;

import java.util.Scanner;

public class SinhVien {
	private String masv;
	private String hoten;
	private double diem;
	private int age;

	public SinhVien() {

	}

	public SinhVien(String masv, String hoten, double diem, int age) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.age = age;
	}

	public void nhapdulieu() {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println("Nhap MaSv : ");
			this.masv = in.nextLine();
			System.out.println("Nhap Ho Ten : ");
			this.hoten = in.nextLine();

			// Diem : tu 0 den 10
			while (true) {
				try {
					System.out.println("Nhap diem : ");
					this.diem = in.nextDouble();
					if (diem < 0 || diem > 10) {
						throw new Exception(" Diem phai tu 0 den 10");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("Loi: Diem phai la mot so thuc!");
				} catch (Exception e) {
					System.out.println("Loi: " + e.getMessage());
				}
			}
			// Tuoi : tu 18 den 100
			while (true) {
				try {
					System.out.println("Nhap tuoi : ");
					this.age = in.nextInt();
					if (age < 18 || age > 100) {
						throw new Exception(" Tuoi phai tu 18 den 100");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("Loi: Tuoi phai la mot so nguyen!");
				} catch (Exception e) {
					System.out.println("Loi: " + e.getMessage());
				}
			}
		}
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + "]";
	}

}
