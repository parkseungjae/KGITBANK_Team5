package for_quiz_0729;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		/*
		# 1번. 전우진 문제
		1부터 입력한 숫자까지 중 짝수의 총 합을 구하시오.
		*/
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		System.out.print("숫자 입력 : ");
		num = input.nextInt();
		for(int i = 0; i <= num; i+=2) {
			sum += i;
		}
		System.out.println("1 ~ " + num + " 짝수의 총 합 : " + sum);
	}
	
}
