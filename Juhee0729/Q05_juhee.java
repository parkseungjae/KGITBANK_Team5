package Juhee0729;

import java.util.Scanner;

public class Q05_juhee {
	/*
	# 5번. 이주희 문제
	입력한 수만큼 별이 하나씩 늘어나도록 출력해라
	ex) 4를 입력했을때
	*
	**
	***
	****
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별 개수 입력>>");
		int num=scanner.nextInt();
		int i=1;
		System.out.println();
		
		while(i<=num) {
			for(i=1; i<=num; i++) {
				for(int star=1; star<=i; star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}
}
