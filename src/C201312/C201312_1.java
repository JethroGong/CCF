package C201312;

import java.util.Scanner;

public class C201312_1 {
	public static void main(String[] args) {
		new C201312_1().run();
	}

	public void run() {
		Scanner fin = new Scanner(System.in);
		int N = fin.nextInt();
		int[] count = new int[10001];
		for (int i = 0; i < N; i++) {
			count[i] = fin.nextInt();
		}
		int maxCount = -1;
		int result = 0;
		for (int i = 0; i < N; i++) {

		}

		System.out.println(result);
		fin.close();
	}
}
