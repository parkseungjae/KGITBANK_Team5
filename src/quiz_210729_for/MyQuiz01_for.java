package quiz_210729_for;

import java.util.Scanner;
//�ڽ��� ����
public class MyQuiz01_for {
	public static void main(String[] args) {
		System.out.println("���� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		for(int i = 1; i<=100; i++) {
			if(i%select == 0) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}
}
