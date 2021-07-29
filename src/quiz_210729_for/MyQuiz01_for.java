package quiz_210729_for;

import java.util.Scanner;
//박승재 문제
public class MyQuiz01_for {
	public static void main(String[] args) {
		System.out.println("수를 입력해주세요");
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
