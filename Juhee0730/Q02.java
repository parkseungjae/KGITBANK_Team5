package Juhee0730;

import java.util.Iterator;

public class Q02 {
/*
#2번. 이주희 문제
첫날에는 10원으로 시작해서 매일 저금하는데,
전날 넣었던 금액에 10원씩을 더 더해서 저금한다.
ex) 첫날 10, 둘째날 20(총 금액 30), 셋째날 30(총 금액 60) ...
30일에 저금하는 건 얼마이며 그동안 저금한 총 금액은?
 */
	public static void main(String[] args) {
		int won=10, sum=0, day=1;
		while(day<=30) {
			
			won*=day;
			sum+=won;
			System.out.printf("%d일차 %d원 저금/총:%d원\n",day,won,sum);
			
			won=10;
			day++;
			System.out.println();
			
		}
		//이중 반복
		won=0; sum=0; day=1; int cnt=day;
		while(day<=30) {
			
			for(; cnt<=day; cnt++) {
				won+=10;
			}
			sum+=won;
			System.out.println(day+"일 /"+won+"원 저금 / 합:"+sum);
			day++;
		}
		
	}
}
