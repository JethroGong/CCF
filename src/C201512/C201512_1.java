package C201512;

//�����ţ�	201512-1
//�������ƣ�	��λ֮��
//ʱ�����ƣ�	1.0s
//�ڴ����ƣ�	256.0MB
//����������	
//��������
//��������һ��ʮ��������n�����n�ĸ�λ����֮�͡�
//�����ʽ
//��������һ������n��
//�����ʽ
//�������һ����������ʾ�𰸡�
//��������
//20151220
//�������
//13
//����˵��
//����20151220�ĸ�λ����֮��Ϊ2+0+1+5+1+2+2+0=13��
//����������ģ��Լ��
//�������������������㣺0 �� n �� 1000000000��
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
