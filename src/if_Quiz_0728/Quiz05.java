package if_Quiz_0728;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		# 5��. ������ ����
		3���� ������ �Է¹޾� �ִ�,�ּ� ���� ����ϰ� �� ���� 3�� ������� Ȯ���϶�
		*/
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max, min;
		System.out.print("�� �� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		// �ִ� ���ϱ�
		max = num3;
		if(num1 > max)
			max = num1;
		if(num2 > max)
			max = num2;
		System.out.println("�ִ� : " + max);
		// �ּڰ� ���ϱ�
		min = num3;
		if(num1 < min)
			min = num1;
		if(num2 < min)
			min = num2;
		System.out.println("�ּڰ� : " + min);
		
		// �ִ�, �ּڰ��� 3�� ��� Ȯ��
		if(max % 3 == 0) {
			System.out.println("�ִ� " + max + "�� 3�� ����Դϴ�.");
		}else {
			System.out.println("�ִ� " + max + "�� 3�� ����� �ƴմϴ�.");
		}
		if(min % 3 == 0) {
			System.out.println("�ּڰ� " + min + "�� 3�� ����Դϴ�.");
		}else {
			System.out.println("�ּڰ� " + min + "�� 3�� ����� �ƴմϴ�.");
		}
	}
}
