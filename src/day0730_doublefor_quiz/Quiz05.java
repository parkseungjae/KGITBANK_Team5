package day0730_doublefor_quiz;

public class Quiz05 {
	public static void main(String[] args) {
		/*
		# 5��. ������ ����
		1 ~ 1000 ������ ���� ���Ͻÿ�.
		�� 5�� ����� �����ϰ� 5�� ����̸鼭 8�� ����ΰ��� �������� �ʴ� �������� ���Ͻÿ�.
		*/
		int sum = 0;
		for(int num = 1; num <= 1000; num++) {
			if(num % 5 == 0 && num % 8 != 0)
				continue;
			sum += num;
		}
		System.out.println("�� �� : " + sum);
	}
}
