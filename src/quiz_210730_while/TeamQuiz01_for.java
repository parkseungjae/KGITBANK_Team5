package quiz_210730_while;

public class TeamQuiz01_for {

	public static void main(String[] args) {
		//이주희 문제
		int i = 10;
		int input =0;
		for(int day = 1; day <=30; day++) {
			input += i;
			i += 10;

		}
		System.out.println(input + "원 총 입금한 금액");

	}

}
