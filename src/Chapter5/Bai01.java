package Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList();
		double sum = 0;
		int i = 0;
		System.out.println("Nhap vao so nguyen bat ki: ");
		while (true) {
			System.out.println("Nhap ptu thu " + (i + 1));
			double x = in.nextDouble();
			arr.add(x);
			sum += arr.get(i);
			i++;
			in.nextLine(); // xoa Enter vi nextDouble chi doc 1 so truoc do khong doc Enter
			// neu kh co dong nay thi phan o duoi tu doc dau Enter -> rong
			System.out.println("Ban co muon nhap them (Y/N)? ");
			String op = in.nextLine();
			if (op.equals("N") || op.equals("n")) {
				break;
			}
		}
		System.out.println("Check array: " + arr);
		System.out.println("Tong bang = " + sum);
	}
}
