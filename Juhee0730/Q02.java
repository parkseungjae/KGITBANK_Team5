package Juhee0730;

import java.util.Iterator;

public class Q02 {
/*
#2��. ������ ����
ù������ 10������ �����ؼ� ���� �����ϴµ�,
���� �־��� �ݾ׿� 10������ �� ���ؼ� �����Ѵ�.
ex) ù�� 10, ��°�� 20(�� �ݾ� 30), ��°�� 30(�� �ݾ� 60) ...
30�Ͽ� �����ϴ� �� ���̸� �׵��� ������ �� �ݾ���?
 */
	public static void main(String[] args) {
		int won=10, sum=0, day=1;
		while(day<=30) {
			
			won*=day;
			sum+=won;
			System.out.printf("%d���� %d�� ����/��:%d��\n",day,won,sum);
			
			won=10;
			day++;
			System.out.println();
			
		}
		//���� �ݺ�
		won=0; sum=0; day=1; int cnt=day;
		while(day<=30) {
			
			for(; cnt<=day; cnt++) {
				won+=10;
			}
			sum+=won;
			System.out.println(day+"�� /"+won+"�� ���� / ��:"+sum);
			day++;
		}
		
	}
}