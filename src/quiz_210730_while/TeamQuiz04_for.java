package quiz_210730_while;

public class TeamQuiz04_for {
	//오성택 문제
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i<1000) {
			i++;
		
			if(i%5==0 && i%8==0) {
				sum +=i;
				continue;
			}else if(i%5==0) {
				continue;
			}
			sum += i;
			System.out.println(sum);

		}
	}
}
