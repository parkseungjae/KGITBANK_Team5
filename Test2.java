package day04_if;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// ������ ����Ǯ��
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("���� �Է� : ");
		year = sc.nextInt();

		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
}
