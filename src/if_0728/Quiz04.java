package if_0728;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		# 4번. 김원준 문제
		10살 이상 20살 미만이면 10대 이상입니다.를 출력하고,
		20살 이상 30살 미만이면 20대입니다.
		30살 이상이면 30대 이상입니다.를 출력해주세요.
		*/
		
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age >= 10 && age < 20) {
			System.out.println("10대 입니다.");
		}else if(age >= 20 && age < 30) {
			System.out.println("20대 입니다.");
		} else {
			System.out.println("30대 이상입니다.");
		}
	}
}

