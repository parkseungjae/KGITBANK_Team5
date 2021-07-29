package day0729_for_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		# 4번. 박승재 문제
		1부터 100까지 숫자중 입력받은 수의 배수들만 출력받게하라
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
