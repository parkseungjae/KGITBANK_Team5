package day04_if;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		// 이주희 문제풀이
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, avg;
		System.out.print("B의 국어, 영어, 수학 성적 입력(순서대로) : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		avg = (kor + eng + math) / 3;
		System.out.println("B의 3과목 평균 : " + avg);
		
		if(avg  >= 80) {
			System.out.println("참 잘했어요");
		}else if(avg >= 60 && avg < 80) {
			System.out.println("잘했어요");
		}else if(avg >= 30 && avg < 60) {
			System.out.println("아쉽네요");
		}else {
			System.out.println("좀 더 분발하세요");
		}
	}
}
