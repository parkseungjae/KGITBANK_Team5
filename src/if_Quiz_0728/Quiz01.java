package if_quiz_0728;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
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
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("A�л��� ���� �Է�(0~100) : ");
		score = sc.nextInt();

		if(score < 0 || score > 100) {
			System.out.println("0~100 ������ ���� �Է��ϼ���.");
		}else if(score >= 80 && score <= 100) {
			System.out.println("A�л��� ���� : A");
		}else if(score >= 60 && score < 80) {
			System.out.println("A�л��� ���� : B");
		}else if(score >= 40 && score < 60) {
			System.out.println("A�л��� ���� : C");
		}else if(score >= 20 && score < 40) {
			System.out.println("A�л��� ���� : D");
		}else {
			System.out.println("A�л��� ���� : F");
		}
	}
}
