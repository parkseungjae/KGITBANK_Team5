package for_0729;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		# 1��. ������ ����
		1���� �Է��� ���ڱ��� �� ¦���� �� ���� ���Ͻÿ�.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� �ϼ��� >>");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1; i<=num; i++) {
			if(i%2==0)
				sum+=i;
			System.out.println(i+"������ �հ�:"+sum);
		}
	}
	
}

