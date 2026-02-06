package Chapter11;

public class TestThread extends Thread {

	public void run() {
		System.out.println(" start thread");
		long sum = 0L;
		for (long i = 0L; i < 10000000000L; i++) {
			sum += i;
		}
		System.out.println(" end thread");
	}

	public static void main(String[] args) {
		int MAX = 2;
		for (int i = 0; i < MAX; i++) {
			(new TestThread()).start();
		}

		System.out.println("finish");
	}
}
