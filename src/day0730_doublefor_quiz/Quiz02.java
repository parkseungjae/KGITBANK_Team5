package day0730_doublefor_quiz;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		# 2��. ������ ����(while�̳� for �̿��� ���� �ݺ���)
		ù������ 10������ �����ؼ� ���� �����ϴµ�,
		���� �־��� �ݾ׿� 10������ �� ���ؼ� �����Ѵ�.
		ex) ù�� 10, ��°�� 20(�� �ݾ� 30), ��°�� 30(�� �ݾ� 60) ...
		30�Ͽ� �����ϴ� �� ���̸� �׵��� ������ �� �ݾ���?
		*/
		int money = 10, sum = 0;
		for(int day = 1; day <= 30; day++, money+=10) {
			sum += money;
			System.out.println(day + "�� ���� �ݾ� : " + money);
			System.out.println(day + "�� ������ �� ���� �ݾ� : " + sum);
			System.out.println();
		}
	}
}
