package C201409;

import java.util.Scanner;

public class C201409_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (a[i] - a[j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
