package for_quiz_0729;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		/*
		# 1��. ������ ����
		1���� �Է��� ���ڱ��� �� ¦���� �� ���� ���Ͻÿ�.
		*/
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		System.out.print("���� �Է� : ");
		num = input.nextInt();
		for(int i = 0; i <= num; i+=2) {
			sum += i;
		}
		System.out.println("1 ~ " + num + " ¦���� �� �� : " + sum);
	}
	
}
