package quiz_210729_for;

import java.util.Scanner;

public class TeamQuiz01_for {
	public static void main(String[] args) {
		//������ ����
		System.out.println("���� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = sc.nextInt();
		for (int i = 1; i<=input; i++) {
			if(i % 2 == 0) {
				sum +=i;
			}			
		}
		System.out.println("�Է��� " + input+"������ �� �� ¦���� ���� " +sum+"�Դϴ�.");

		sc.close();
	}
}
