package Juhee0729;

public class Q02_juhee {
	/*
	# 2번. 이주희 문제
	for문을 이용해 00시 24분으로 시작해
	시간은 1씩 늘어나고, 분은 2씩 감소하게 하여
	마지막에는 00분이 될때까지 출력하라
	 */
	public static void main(String[] args) {
		int hour, min=24;
		for (hour=0; hour<=12; hour++) {
			if(hour<10) {
				System.out.print(0);
			}
			System.out.print(hour+"시");
			if(min<10) {
				System.out.print(0);
			}
			
			System.out.println(min+"분");
			min-=2;
		}
		
	}
}
