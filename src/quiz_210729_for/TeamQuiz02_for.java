package quiz_210729_for;

public class TeamQuiz02_for {
	public static void main(String[] args) {
		//����� ����
		int hour=0,min = 0;
		for(hour = 1; hour <= 12; hour++) {
			for(min=24; min>=0;min-=2) {
				if(min == 0) {
				System.out.println("����ð���"+hour+"��" + min + "�� �����Դϴ�.");
			
				}
			}
		}

	}
}
