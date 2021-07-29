package if_quiz_0728;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		# 3번. 이주희 문제
		B의 국어, 영어, 수학 성적을 입력받아
		합계와 평균을 구해 출력하고, 
		세 과목의 평균이 80 이상인 사람에게 "참 잘했어요"
		60이상 80미만이면 "잘했어요"
		30이상 60미만이면 "아쉽네요"
		30미만이면 "좀 더 분발하세요"
		를 출력하는 문제
		*/
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
