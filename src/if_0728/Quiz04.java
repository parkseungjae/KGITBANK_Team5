package if_0728;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		# 4��. ����� ����
		10�� �̻� 20�� �̸��̸� 10�� �̻��Դϴ�.�� ����ϰ�,
		20�� �̻� 30�� �̸��̸� 20���Դϴ�.
		30�� �̻��̸� 30�� �̻��Դϴ�.�� ������ּ���.
		*/
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		if(age >= 10 && age < 20) {
			System.out.println("10�� �Դϴ�.");
		}else if(age >= 20 && age < 30) {
			System.out.println("20�� �Դϴ�.");
		} else {
			System.out.println("30�� �̻��Դϴ�.");
		}
	}
}

