package day04_if;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		// �ڽ��� ����Ǯ��
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
