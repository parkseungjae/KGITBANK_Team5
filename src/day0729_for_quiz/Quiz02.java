package day0729_for_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		# 2번. 이주희 문제
		이중for문을 이용해 00시 24분으로 시작해
		시간은 1씩 늘어나고, 분은 2씩 감소하게 하여
		마지막에는 00분이 될때까지 출력하라
		 */
		// 전우진: 단일for문으로 풀려서 아래와같이 했습니다.
		int hour = 0;
		int min = 24;
		for( ; min >= 00; hour++, min -= 2) {
			System.out.println(hour + "시 " + min + "분 입니다.");
		}
	}

}
