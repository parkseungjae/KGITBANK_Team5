package Juhee0729;

import java.util.Scanner;

public class Q05_juhee {
	/*
	# 5��. ������ ����
	�Է��� ����ŭ ���� �ϳ��� �þ���� ����ض�
	ex) 4�� �Է�������
	*
	**
	***
	****
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� �Է�>>");
		int num=scanner.nextInt();
		int i=1;
		System.out.println();
		
		while(i<=num) {
			for(i=1; i<=num; i++) {
				for(int star=1; star<=i; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}
}