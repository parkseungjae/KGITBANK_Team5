package Juhee0730;

import java.util.Scanner;

public class Q04 {
/*
# 4번. 전우진 문제
두개의 숫자를 입력한 후 범위에 해당되는 숫자의 구구단을 출력하세요.
조건 1) 만약 두 숫자증 하나라도 2 ~ 9 범위를 벗어나면 반복문을 사용하여 다시 입력하게 해주세요.
   두 숫자 모두 범위에서 벗어나지않으면 구구단을 출력한 후 프로그램은 종료됩니다.
조건 2) 입력 값이 7 4 순서라면 4단부터 7단까지로 출력해주세요.
   4 7 순서여도 4단 ~ 7단 순으로 출력해주세요.
조건 3) 입력 값이 4 4 이면 4단만 출력하면 됩니다.

----- 예시 -----
두 수 입력(2 ~ 9) : 11 7
범위에 맞게 다시 입력해주세요

두 수 입력(2 ~ 9) : 2 10
범위에 맞게 다시 입력해주세요

두 수 입력(2 ~ 9) : 7 4
4 * 1 = 4   5 * 1 = 5   6 * 1 = 6   7 * 1 = 7   
4 * 2 = 8   5 * 2 = 10   6 * 2 = 12   7 * 2 = 14   
4 * 3 = 12   5 * 3 = 15   6 * 3 = 18   7 * 3 = 21   
4 * 4 = 16   5 * 4 = 20   6 * 4 = 24   7 * 4 = 28   
4 * 5 = 20   5 * 5 = 25   6 * 5 = 30   7 * 5 = 35   
4 * 6 = 24   5 * 6 = 30   6 * 6 = 36   7 * 6 = 42   
4 * 7 = 28   5 * 7 = 35   6 * 7 = 42   7 * 7 = 49   
4 * 8 = 32   5 * 8 = 40   6 * 8 = 48   7 * 8 = 56   
4 * 9 = 36   5 * 9 = 45   6 * 9 = 54   7 * 9 = 63
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, result;
		
		while(true) {
			System.out.print("두 수 입력>>");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			if(2>num1||num1>9||2>num2||num2>9) {
				System.out.println("범위에 맞게 다시 입력해주세요");
				continue;
			}
			if(num2<num1) {
				int min=num2; int max=num1;
				num1=min; num2=max;
			}
			
			for(int i=1; i<=9; i++) {
				System.out.println(i);
				for(int j=num1; j<=num2; j++) {
					result=j*i;
					System.out.printf("%d*%d=%d\t",j,i,result);
				}
				System.out.println();
			}break;
		}
		
	}
}
