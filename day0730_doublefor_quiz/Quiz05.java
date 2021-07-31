package day06_while;
//문제내기 1~1000까지의 합을 구하시오 
//단 5의 배수는 제외하고 5의 배수이면서 8의 배수인것은 제외하지 않는 조건으로 구하시오
public class QuizG {
	public static void main(String[] args) {
		
		int i;
		int sum =0;
		int sum1 =0;
		
	  for(i=1 ; i<=1000; i++) {
		  if(i%5==0 && i%8!=0)
			  sum1+=i;
		  sum+=i;
	  }
				sum= sum-sum1;
				System.out.println(sum);
		
		
	}
}
//결과값 413000