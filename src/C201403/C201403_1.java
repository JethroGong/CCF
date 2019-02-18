package C201403;

//试题编号：	201403-1
//试题名称：	相反数
//时间限制：	1.0s
//内存限制：	256.0MB
//问题描述：	
//问题描述
//　　有 N 个非零且各不相同的整数。请你编一个程序求出它们中有多少对相反数(a 和 -a 为一对相反数)。
//输入格式
//　　第一行包含一个正整数 N。(1 ≤ N ≤ 500)。
//　　第二行为 N 个用单个空格隔开的非零整数,每个数的绝对值不超过1000,保证这些整数各不相同。
//输出格式
//　　只输出一个整数,即这 N 个数中包含多少对相反数。
//样例输入
//5
//1 2 3 -1 -2
//样例输出
//2
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
