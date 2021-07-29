package quiz_210729_for;

import java.util.Scanner;

public class TeamQuiz01_for {
	public static void main(String[] args) {
		//전우진 문제
		System.out.println("수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = sc.nextInt();
		for (int i = 1; i<=input; i++) {
			if(i % 2 == 0) {
				sum +=i;
			}			
		}
		System.out.println("입력한 " + input+"까지의 수 중 짝수의 합은 " +sum+"입니다.");

		sc.close();
	}
}
