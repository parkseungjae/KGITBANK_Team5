package day0729_for_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		# 4��. �ڽ��� ����
		1���� 100���� ������ �Է¹��� ���� ����鸸 ��¹ް��϶�
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
