package Juhee0730;

import java.util.Scanner;

public class Q03 {
/*
#3. 김원준 문제
*****
 ***
  *
 ***
*****
모래시계 형태로 만들기
 */
	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			for(int space = 0; space < 5-i; space++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= 2*i-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5; i++) {
			for(int space = 1; space <= 3-i+1; space++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= 2*i+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
