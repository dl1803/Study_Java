package Chapter10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestChap10 {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		System.out.println(System.getProperty("user.dir"));
		try {
			inputStream = new FileReader("./src/Chapter10/TestFileChap10.txt");
			// goi tu srcv (Relative Path - di tu thu muc goc (.)) : new FileReader("duong
			// dan tu src/ neu o src roi
			// thi chi ghi ten + duoi ")
			// Absolute Path : D:\Workspace\JAVA\HocJava\characteroutput.txt
			outputStream = new FileWriter("characteroutput.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
			System.out.println("END");
		}
	}
}
