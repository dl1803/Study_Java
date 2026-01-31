package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("Nhap so luong phan tu cua mang: ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] a = new int[x];
		System.out.println("Nhap cac phan tu cho mang: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Phan tu a[%d] = %d\n", i, a[i]);
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
//		System.out.println("Phan tu nho nhat = " + a[0]);
//		System.out.println("Phan tu lon nhat = " + a[a.length - 1]);
		System.out.println("Phan tu nho nhat = " + min);
		System.out.println("Phan tu lon nhat = " + max);
	}
}
