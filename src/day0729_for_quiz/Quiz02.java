package day0729_for_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		# 2��. ������ ����
		����for���� �̿��� 00�� 24������ ������
		�ð��� 1�� �þ��, ���� 2�� �����ϰ� �Ͽ�
		���������� 00���� �ɶ����� ����϶�
		 */
		// ������: ����for������ Ǯ���� �Ʒ��Ͱ��� �߽��ϴ�.
		int hour = 0;
		int min = 24;
		for( ; min >= 00; hour++, min -= 2) {
			System.out.println(hour + "�� " + min + "�� �Դϴ�.");
		}
	}

}
