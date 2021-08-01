package day0730_doublefor_quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		# 1번. 박승재 문제
		Console
		홀수를 입력해주세요
		5
		  *
		 ***
		*****
		 ***
		  *
		*/
		Scanner sc = new Scanner(System.in);
		// 짝수 홀수 판별
		int num;
		while(true) {
			System.out.println("홀수를 입력해주세요");
			num = sc.nextInt();
			if(num % 2 == 0)
				System.out.println("짝수를 입력하셨습니다. 다시 입력해주세요.\n");
			else
				break;
		}
		// 윗 별 찍기
		for(int x = 1; x <= num/2+1; x++) {
			for(int y = 0; y <= num/2-x; y++) {
				System.out.print(" ");
			}
			for(int z = 0; z < 2*x-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 아랫 별 찍기
		for(int x = num/2; x >= 0; x--) {
			for(int y = 0; y <= num/2-x; y++) {
				System.out.print(" ");
			}
			for(int z = 0; z < 2*x-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
