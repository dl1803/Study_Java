package Chapter4;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double tax;

	public void nhapThongTin() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap thong tin product: ");
		System.out.println("Nhap ten product : ");
		this.name = in.next();
		System.out.println("Nhap gia cua product: ");
		this.price = in.nextDouble();
		System.out.println("Nhap tax cua product: ");
		this.tax = in.nextDouble();
	};

	public Product nhapThongTinVer2(String name, double price, double tax) {
		Product p = new Product(name, price, tax);
		return p;
	}

	public void xuatThongTin() {
		System.out.println("Xuat thong tin product: ");
		System.out.println("Ten product : " + this.name);
		System.out.println("Gia cua product: " + this.price);
		System.out.println("Tax cua product: " + this.tax);
	};

	public double getTaxPrice(double price, double tax) {
		return tax * price;
	}

	public Product() {
		this.name = "";
		this.price = 0.0;
		this.tax = 0.0;
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public static void main(String[] args) {
		// Bai 1 :
//		Product p = new Product();
//		p.nhapThongTin();
//		p.xuatThongTin();
//		System.out.println("Thue : " + p.getTaxPrice(p3.getPrice(), p3.getTax()));
		// Bai 2:
//		Product p1 = new Product();
//		Product p2 = new Product("Jacket", 150, 0.02);
//		p2.xuatThongTin();
//		p2.getTaxPrice(p3.getPrice(), p3.getTax());
		// Bai 3:
		Product p3 = new Product();
		p3.setName("Ao");
		p3.setPrice(150);
		p3.setTax(0.2);
		System.out.println("Thong tin san pham : ");
		System.out.println("Ten san pham: " + p3.getName());
		System.out.println("Gia san pham: " + p3.getPrice());
		System.out.println("Phan tram thue san pham: " + p3.getTaxPrice(p3.getPrice(), p3.getTax()));
		Product test = new Product();
		Product p4 = test.nhapThongTinVer2("A", 0, 0);
		p4.xuatThongTin();
	}

}