package Juhee0729;

import java.util.Scanner;

public class Q01_juhee {
/*
# 1��. ������ ����
1���� �Է��� ���ڱ��� �� ¦���� �� ���� ���Ͻÿ�.
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Է�>>");
		int num = scanner.nextInt();
		int sum=0;
		for (int i=1; i<=num; i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println(i+"������ ¦�� �հ�:"+sum);
			}
			
		}
	}
}	