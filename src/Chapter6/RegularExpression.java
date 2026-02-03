package Chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// Bai 1:
		Pattern pattern1 = Pattern.compile("\\d{12}"); // [0-9] = \\d
		Matcher matcher1 = pattern1.matcher("0991456974111 ");
		System.out.println("Input String matches regex - " + matcher1.matches());
		// Bai2:
		Pattern pattern2 = Pattern.compile(".{6,}");
		Matcher matcher2 = pattern2.matcher("011 ");
		System.out.println("Input String matches regex - " + matcher2.matches());
		// Bai3:
		Pattern pattern3 = Pattern.compile(".+@.+\\..+"); // "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
		Matcher matcher3 = pattern3.matcher("ducloi123@gmail.com");
		System.out.println("Input String matches regex - " + matcher3.matches());
	}

}
