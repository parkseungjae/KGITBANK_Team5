package day0730_doublefor_quiz;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		# 2번. 이주희 문제(while이나 for 이용한 이중 반복문)
		첫날에는 10원으로 시작해서 매일 저금하는데,
		전날 넣었던 금액에 10원씩을 더 더해서 저금한다.
		ex) 첫날 10, 둘째날 20(총 금액 30), 셋째날 30(총 금액 60) ...
		30일에 저금하는 건 얼마이며 그동안 저금한 총 금액은?
		*/
		int money = 10, sum = 0;
		for(int day = 1; day <= 30; day++, money+=10) {
			sum += money;
			System.out.println(day + "일 저금 금액 : " + money);
			System.out.println(day + "일 까지의 총 저금 금액 : " + sum);
			System.out.println();
		}
	}
}
