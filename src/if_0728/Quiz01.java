package if_0728;

import java.util.Scanner;

public class Quiz01 {
	public	static void main(String[] args) {
		/*
		# 1번. 박승재 문제
		A라는 학생이 있습니다.
		A의 성적을 입력받게하고
		성적이 100이하 80이상이면 A
		80미만 60이상이면 B
		60미만 40이상이면 C
		40미만 20이상이면 D
		20미만이면 F로 부여하게 만들어주세요!
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("A의 성적");
		int score = scanner.nextInt();

		if(score >= 80 && score <= 100)
			System.out.println("A");
		else if(score >= 60 && score < 80)
			System.out.println("B");
		else if(score >= 40 && score < 60)
			System.out.println("C");
		else if(score >= 20 && score < 40)
			System.out.println("D");
		else
			System.out.println("F");

	}
}


