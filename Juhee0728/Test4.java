package test;

import java.util.Scanner;

public class Test4 {
	/*
	김원준 문제
	10살 이상 20살 미만이면 10대 이상입니다.를 출력하고,
 	20살 이상 30살 미만이면 20대입니다.
 	30살 이상이면 30대 이상입니다.를
 	출력해주세요.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 입력>>");
		int age = scanner.nextInt();
		String result = "";
		if ((10<=age)&&(age<20)) {
			result = "10대 이상입니다.";
		}else if((20<=age)&&(age<30)) {
			result = "20대입니다.";
		}else {
			result="30대 이상입니다.";
		}
		System.out.println("나이는 "+age+"세 입니다.\n"+result);
		
	}
}
