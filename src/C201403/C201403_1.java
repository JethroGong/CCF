package C201403;

//�����ţ�	201403-1
//�������ƣ�	�෴��
//ʱ�����ƣ�	1.0s
//�ڴ����ƣ�	256.0MB
//����������	
//��������
//������ N �������Ҹ�����ͬ�������������һ����������������ж��ٶ��෴��(a �� -a Ϊһ���෴��)��
//�����ʽ
//������һ�а���һ�������� N��(1 �� N �� 500)��
//�����ڶ���Ϊ N ���õ����ո�����ķ�������,ÿ�����ľ���ֵ������1000,��֤��Щ����������ͬ��
//�����ʽ
//����ֻ���һ������,���� N �����а������ٶ��෴����
//��������
//5
//1 2 3 -1 -2
//�������
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
