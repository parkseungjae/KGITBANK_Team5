package quiz_210730_while;

import java.util.Scanner;

public class Myquiz_01 {
	//박승재 문제
	public static void main(String[] args) {
		System.out.println("홀수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j =0; j<num; j++) {
				if(i<=num/2) {
					if(i+j<=num/2-1)
						System.out.print(" ");
					else if(j-i>=num/2+1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				else if(i>num/2) {
					if(i-j>=num/2+1)
						System.out.print(" ");
					else if(i+j>=num/2*3+1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
