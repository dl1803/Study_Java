package Chapter5;

import java.util.ArrayList;

import Chapter4.Student;

public class Test1Chap5 {
	public static void main(String[] args) {
		System.out.println("run Test1Chap5");

		// method :
		// add : them ptu vao cuoi
		// size : cho biet so luong ptu
		// get(chi so cua ptu) : lay ptu theo chi so
		// remove(chi so cua ptu) : xoa ptu theo chi so
		// clear : xoa all
		//
		ArrayList e = new ArrayList(); // khong dung generic : them KDL bat ki

		ArrayList<String> a1 = new ArrayList<String>(); // generic
//		a1.add(2); type error 
// integer duoc JAVA auto boxing : tu KDL nguyen thuy (integer) sang KDL khong  nguyen thuy (Integer - Object)
		a1.add("Hello World");
// tuong tu string -> String
		System.out.println(a1.toString());

		ArrayList<Integer> a2 = new ArrayList(); // Java Diamond : generic rut gon (chi van viet ben trai)
		a2.add(2);
		// a2.add("A"); error : chi duoc luu Integer

		ArrayList<Student> a3 = new ArrayList();

	}
}
