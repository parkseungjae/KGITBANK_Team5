package Juhee0730;

public class Q05 {
/*
# 5번. 오성택 문제
1 ~ 1000 까지의 합을 구하시오.
단 5의 배수는 제외하고 5의 배수이면서 8의 배수인것은 제외하지 않는 조건으로 구하시오.
 */
	public static void main(String[] args) {
		int cnt, sum=0;
		
		for(cnt=1; cnt<=1000; cnt++) {
			if(cnt%5==0&&cnt%8!=0) {
				continue;
			}
			sum+=cnt;
			System.out.println("더한 수:"+cnt+"/합:"+sum);
		}
	}
}
