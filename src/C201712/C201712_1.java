package C201712;

import java.util.Scanner;

public class C201712_1 {
	public static void main(String[] args) {
		new C201712_1().run();
	}

	public void run() {
		int flag = Integer.MAX_VALUE;
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc1.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (Math.abs(a[i] - a[j]) < flag) {
					flag = Math.abs(a[i] - a[j]);
				}
			}
		}
		System.out.println(flag);
		sc1.close();
	}
}
