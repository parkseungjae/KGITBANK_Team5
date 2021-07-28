package day04_if;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		// 박승재 문제풀이
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("A학생의 성적 입력(0~100) : ");
		score = sc.nextInt();

		if(score < 0 || score > 100) {
			System.out.println("0~100 범위의 값을 입력하세요.");
		}else if(score >= 80 && score <= 100) {
			System.out.println("A학생의 성적 : A");
		}else if(score >= 60 && score < 80) {
			System.out.println("A학생의 성적 : B");
		}else if(score >= 40 && score < 60) {
			System.out.println("A학생의 성적 : C");
		}else if(score >= 20 && score < 40) {
			System.out.println("A학생의 성적 : D");
		}else {
			System.out.println("A학생의 성적 : F");
		}
	}
}
