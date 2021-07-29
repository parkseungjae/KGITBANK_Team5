package day0729_for_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/*
		# 5번. 이주희 문제
		입력한 수만큼 별이 하나씩 늘어나도록 출력해라
		ex) 입력값 : 4
		*
		**
		***
		****
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		for(int i = num; i > 0; i--) {
			for(int j = num; i-j <= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
