package C201412;

import java.util.Scanner;

public class C201412_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];
		int tmp[] = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			int count = 0;
			tmp[i] = a[i];
			for (int j = i; j >= 0; j--) {
				if (tmp[i] == tmp[j]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
		sc.close();
	}
}
