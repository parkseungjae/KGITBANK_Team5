package for_0729;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		# 1번. 전우진 문제
		1부터 입력한 숫자까지 중 짝수의 총 합을 구하시오.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 하세요 >>");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1; i<=num; i++) {
			if(i%2==0)
				sum+=i;
			System.out.println(i+"까지의 합계:"+sum);
		}
	}
	
}

