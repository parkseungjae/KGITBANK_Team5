package day04_if;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		// ����� ����Ǯ��
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
