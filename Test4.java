package day04_if;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		// 김원준 문제풀이
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
