package day0730_doublefor_quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		# 1��. �ڽ��� ����
		Console
		Ȧ���� �Է����ּ���
		5
		  *
		 ***
		*****
		 ***
		  *
		*/
		Scanner sc = new Scanner(System.in);
		// ¦�� Ȧ�� �Ǻ�
		int num;
		while(true) {
			System.out.println("Ȧ���� �Է����ּ���");
			num = sc.nextInt();
			if(num % 2 == 0)
				System.out.println("¦���� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			else
				break;
		}
		// �� �� ���
		for(int x = 1; x <= num/2+1; x++) {
			for(int y = 0; y <= num/2-x; y++) {
				System.out.print(" ");
			}
			for(int z = 0; z < 2*x-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// �Ʒ� �� ���
		for(int x = num/2; x >= 0; x--) {
			for(int y = 0; y <= num/2-x; y++) {
				System.out.print(" ");
			}
			for(int z = 0; z < 2*x-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
