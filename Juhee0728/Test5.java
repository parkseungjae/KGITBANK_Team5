package test;

import java.util.Scanner;

public class Test5 {
	/*
	 3개의 정수를 입력받아 최대,최소 값을 출력하고 그 수가 3의 배수인지 확인하라
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3, max=0, min=0;
		System.out.print("세 수를 입력하시오>>");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		//두 개 먼저 비교
		if(num1>num2) {
			max=num1;
		}else if(num1<num2) {
			max=num2;
			min=num1;
		}else {
			max=num1=num2;
			min=num3;
		}
		//최대
		if (max<num3) {
			max=num3;	
		}
		//최소
		if(min>num3) {
			min=num3;
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
	}
}
