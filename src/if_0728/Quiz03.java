package if_0728;

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

		System.out.println("����, ����, ���� ������ �Է����ּ���");

		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int avg = (kor+eng+math)/3;

		if(avg>=80) {
			System.out.println("�� ���߾��!!");
		}else if(60<=avg && avg < 80) {
			System.out.println("���߾��");
		}else if(30<=avg && avg < 60) {
			System.out.println("�ƽ��׿�");
		}else if(avg < 30 ) {
			System.out.println("�� �� �й��ϼ���");

		}


	}

}
