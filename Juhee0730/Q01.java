package Juhee0730;

import java.util.Scanner;

public class Q01 {
/*
# 1. 박승재 문제
홀수를 입력하시오
  *
 ***
*****
 ***
  *
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("홀수 입력>>");
		int num=scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%2==0) {
				System.out.println("홀수를 입력하시오");
				break;
			}
			for(int up = 1; up <= num/2+1; up++) {
				for(int space = 0; space <= num/2-up; space++) {
					System.out.print(" ");
				}
				for(int star = 0; star < 2*up-1; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int down = num/2; down >= 0; down--) {
				for(int space = 0; space <= num/2-down; space++) {
					System.out.print(" ");
				}
				for(int star = 0; star < 2*down-1; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}
