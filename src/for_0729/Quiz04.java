package for_0729;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
	/*
	# 4��. �ڽ��� ����
	1���� 100���� ������ �Է¹��� ���� ����鸸 ��¹ް��϶�
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�>> ");
		int num = sc.nextInt();
		for(int i=1; i<=100; i++) {
		if(i%num==0)	{
			System.out.println(i);
		}
		
		}
}
}