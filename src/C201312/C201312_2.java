package C201312;

import java.util.Scanner;

public class C201312_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		int sum = 0;
		int count = 1;
		for (int i = 0; i < isbn.length() - 1; i++) {
			if (Character.isDigit(isbn.charAt(i))) {
				sum += Character.digit(isbn.charAt(i), 10) * count;
				count++;
			}
		}
		if (sum % 11 == 10) {
			if (isbn.charAt(isbn.length() - 1) == 'X') {
				System.out.println("Right");
			} else {
				System.out.println(isbn.substring(0, isbn.length() - 1) + "X");
			}
		} else {
			if (sum % 11 == Character.digit(isbn.charAt(isbn.length() - 1), 10))
				System.out.println("Right");
			else
				System.out.println(isbn.substring(0, isbn.length() - 1) + sum % 11);
		}
		sc.close();
	}
}
