package if_Quiz_0728;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		# 2��. ������ ����
		����(year)�� �Է����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		������ ����(year)�� 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		ex1) 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�.
		ex2) 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�.
		ex3) 2000���� 400�� ����̱� ������ �����̴�.
		*/
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
