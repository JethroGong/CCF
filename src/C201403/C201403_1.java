package C201403;

import java.util.Scanner;

public class C201403_1 {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A[] = new int[num];
		for (int i = 0; i < num; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (A[i] + A[j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
