package if_quiz_0728;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		# 3��. ������ ����
		B�� ����, ����, ���� ������ �Է¹޾�
		�հ�� ����� ���� ����ϰ�, 
		�� ������ ����� 80 �̻��� ������� "�� ���߾��"
		60�̻� 80�̸��̸� "���߾��"
		30�̻� 60�̸��̸� "�ƽ��׿�"
		30�̸��̸� "�� �� �й��ϼ���"
		�� ����ϴ� ����
		*/
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, avg;
		System.out.print("B�� ����, ����, ���� ���� �Է�(�������) : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		avg = (kor + eng + math) / 3;
		System.out.println("B�� 3���� ��� : " + avg);
		
		if(avg  >= 80) {
			System.out.println("�� ���߾��");
		}else if(avg >= 60 && avg < 80) {
			System.out.println("���߾��");
		}else if(avg >= 30 && avg < 60) {
			System.out.println("�ƽ��׿�");
		}else {
			System.out.println("�� �� �й��ϼ���");
		}
	}
}
