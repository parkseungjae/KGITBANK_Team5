package day0729_for_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/*
		# 5��. ������ ����
		�Է��� ����ŭ ���� �ϳ��� �þ���� ����ض�
		ex) �Է°� : 4
		*
		**
		***
		****
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		for(int i = num; i > 0; i--) {
			for(int j = num; i-j <= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
