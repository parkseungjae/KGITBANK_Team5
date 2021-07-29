package test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
			/////전우진 문제
			/*
			연도(year)를 입력했을 때,
			윤년이면 1, 아니면 0을 출력
			윤년은 연도(year)가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
			 */
			Scanner scanner = new Scanner(System.in);
			System.out.print("연도 입력>>");
			int year = scanner.nextInt();
			String resultYun = "윤년이 아니다.";
			int a=0;
			if(year%4==0) {
				if(year%100!=0) {
					resultYun = "윤년이다.";
					a=1;
				}else if((year%100==0)&&(year%400!=0)) {
					a=0;
				}else if(year%400==0) {
					resultYun = "윤년이다.";
					a=1;
				}
				System.out.println(a+"\n"+year+"년은 "+resultYun);
			}
	}
}
