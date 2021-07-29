package Juhee0729;

import java.util.Scanner;

public class Q01_juhee {
/*
# 1번. 전우진 문제
1부터 입력한 숫자까지 중 짝수의 총 합을 구하시오.
*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수 입력>>");
		int num = scanner.nextInt();
		int sum=0;
		for (int i=1; i<=num; i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println(i+"까지의 짝수 합계:"+sum);
			}
			
		}
	}
}	
