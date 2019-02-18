package C201503;

import java.util.Scanner;

public class C201503_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lr[] = new int[2];
		for (int i = 0; i < 2; i++) {
			lr[i] = sc.nextInt();
		}
		int count = 0;
		int a[][] = new int[lr[0]][lr[1]];
		for (int i = 0; i < lr[0]; i++) {
			for (int j = 0; j < lr[1]; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int j = lr[1] - 1; j >= 0; j--) {
			for (int i = 0; i < lr[0]; i++) {
				if (i == lr[0] - 1) {
					System.out.print(a[i][j]);
				} else {
					// System.out.println(i + " " + j);
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
