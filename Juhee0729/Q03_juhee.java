package Juhee0729;

public class Q03_juhee {
/*
# 3번. 김원준 문제
for문을 활용해서 15부터 65까지 홀수만 출력하세요
 */
	public static void main(String[] args) {
		for(int i=15; i<=65; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
