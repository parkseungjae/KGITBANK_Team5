package if_0728;

import java.util.Scanner;

public class Quiz01 {
	public	static void main(String[] args) {
		/*
		# 1��. �ڽ��� ����
		A��� �л��� �ֽ��ϴ�.
		A�� ������ �Է¹ް��ϰ�
		������ 100���� 80�̻��̸� A
		80�̸� 60�̻��̸� B
		60�̸� 40�̻��̸� C
		40�̸� 20�̻��̸� D
		20�̸��̸� F�� �ο��ϰ� ������ּ���!
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("A�� ����");
		int score = scanner.nextInt();

		if(score >= 80 && score <= 100)
			System.out.println("A");
		else if(score >= 60 && score < 80)
			System.out.println("B");
		else if(score >= 40 && score < 60)
			System.out.println("C");
		else if(score >= 20 && score < 40)
			System.out.println("D");
		else
			System.out.println("F");

	}
}


