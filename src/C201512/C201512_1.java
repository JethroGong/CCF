package C201512;

//试题编号：	201512-1
//试题名称：	数位之和
//时间限制：	1.0s
//内存限制：	256.0MB
//问题描述：	
//问题描述
//　　给定一个十进制整数n，输出n的各位数字之和。
//输入格式
//　　输入一个整数n。
//输出格式
//　　输出一个整数，表示答案。
//样例输入
//20151220
//样例输出
//13
//样例说明
//　　20151220的各位数字之和为2+0+1+5+1+2+2+0=13。
//评测用例规模与约定
//　　所有评测用例满足：0 ≤ n ≤ 1000000000。
import java.util.Scanner;

public class C201512_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int sum = 0;
		int a[] = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			a[i] = Integer.parseInt(num.substring(i, i + 1));
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}
