package test;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		/*박승재 문제
		성적이 100이하 80이상이면 A
		80미만 60이상이면 B
		60미만 40이상이면 C
		40미만 20이상이면 D
		20미만이면 F
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오>>");
		int numA = scanner.nextInt();
		char resultA ='0';
		if (80<=numA&&numA<=100) {
			resultA = 'A';
		}else if(60<=numA&&numA<80) {
			resultA = 'B';
		}else if(40<=numA&&numA<60) {
			resultA = 'C';
		}else if(20<=numA&&numA<40) {
			resultA = 'D';
		}else {
			resultA ='F';
		}
		System.out.println("성적: "+numA+"점\n"+resultA);
		
		
		
		
	}
}
