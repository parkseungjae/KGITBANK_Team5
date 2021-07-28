package day04_if;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		
		// 오성택 문제풀이
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max, min;
		System.out.print("세 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		// 최댓값 구하기
		max = num3;
		if(num1 > max)
			max = num1;
		if(num2 > max)
			max = num2;
		System.out.println("최댓값 : " + max);
		// 최솟값 구하기
		min = num3;
		if(num1 < min)
			min = num1;
		if(num2 < min)
			min = num2;
		System.out.println("최솟값 : " + min);
		
		// 최댓값, 최솟값의 3의 배수 확인
		if(max % 3 == 0) {
			System.out.println("최댓값 " + max + "는 3의 배수입니다.");
		}else {
			System.out.println("최댓값 " + max + "는 3의 배수가 아닙니다.");
		}
		if(min % 3 == 0) {
			System.out.println("최솟값 " + min + "는 3의 배수입니다.");
		}else {
			System.out.println("최솟값 " + min + "는 3의 배수가 아닙니다.");
		}
	}
}
