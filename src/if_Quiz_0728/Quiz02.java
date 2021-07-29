package if_Quiz_0728;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		# 2번. 전우진 문제
		연도(year)를 입력했을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		윤년은 연도(year)가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		ex1) 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
		ex2) 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
		ex3) 2000년은 400의 배수이기 때문에 윤년이다.
		*/
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("연도 입력 : ");
		year = sc.nextInt();

		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
}
