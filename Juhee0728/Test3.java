package test;

import java.util.Scanner;

public class Test3 {
	/*
	이주희 문제
	B의 국어, 영어, 수학 성적을 입력받아
	합계와 평균을 구해 출력하고, 
	세 과목의 평균이 80 이상인 사람에게 "참 잘했어요"
	60이상 80미만이면 "잘했어요"
	30이상 60미만이면 "아쉽네요"
	30미만이면 "좀 더 분발하세요"
	를 출력
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math;
		System.out.print("국어 성적: ");
		kor = scanner.nextInt();
		System.out.print("영어 성적: ");
		eng = scanner.nextInt();
		System.out.print("수학 성적: ");
		math = scanner.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3;
		String result = "";
		
		if(sum<=300) {
			if(80<=avg) {
				result = "참 잘했어요";
			}else if((60<=avg)&&(avg<80)) {
				result = "잘했어요";
			}else if((30<=avg)&&(avg<60)) {
				result = "아쉽네요";
			}else{
				result = "좀 더 분발하세요";}
		}else {
			System.out.println("다시 입력해주세요");
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		System.out.println(result);
	}
}
