package day0730_doublefor_quiz;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		# 5번. 오성택 문제
		1 ~ 1000 까지의 합을 구하시오.
		단 5의 배수는 제외하고 5의 배수이면서 8의 배수인것은 제외하지 않는 조건으로 구하시오.
		*/
		int sum = 0;
		for(int num = 1; num <= 1000; num++) {
			if(num % 5 == 0 && num % 8 != 0)
				continue;
			sum += num;
		}
		System.out.println("총 합 : " + sum);
	}
}
