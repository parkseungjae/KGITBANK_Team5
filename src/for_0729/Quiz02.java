package for_0729;

public class Quiz02 {

	public static void main(String[] args) {


		/*
	# 2��. ������ ����
	for���� �̿��� 00�� 24������ ������
	�ð��� 1�� �þ��, ���� 2�� �����ϰ� �Ͽ�
	���������� 00���� �ɶ����� ����϶�
		 */

		int hour, min=24;
	    for (hour=0; hour<=12; hour++) {
		if(hour< 10) {
			System.out.print(0);
		}
		System.out.print(hour+"��");
		if(min< 10)  {
			System.out.print(0);
		}

		System.out.println(min+"��");
		min-=2;
	}

	}

}
