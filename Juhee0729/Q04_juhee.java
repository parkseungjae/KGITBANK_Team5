package Juhee0729;

import java.util.Scanner;

public class Q04_juhee {
/*
# 4��. �ڽ��� ����
1���� 100���� ������ �Է¹��� ���� ����鸸 ��¹ް��϶�
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Է�>>");
		int num = scanner.nextInt();
		for(int i=1; i<=100; i++) {
			if(i%num==0) {
				System.out.println(i);
			}
		}
	}
}