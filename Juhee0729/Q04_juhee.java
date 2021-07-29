package Juhee0729;

import java.util.Scanner;

public class Q04_juhee {
/*
# 4번. 박승재 문제
1부터 100까지 숫자중 입력받은 수의 배수들만 출력받게하라
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력>>");
		int num = scanner.nextInt();
		for(int i=1; i<=100; i++) {
			if(i%num==0) {
				System.out.println(i);
			}
		}
	}
}
