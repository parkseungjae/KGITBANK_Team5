package if_Quiz_0728;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		# 5번. 오성택 문제
		3개의 정수를 입력받아 최대,최소 값을 출력하고 그 수가 3의 배수인지 확인하라
		*/
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
