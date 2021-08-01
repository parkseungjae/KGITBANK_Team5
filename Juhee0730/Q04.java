package Juhee0730;

import java.util.Scanner;

public class Q04 {
/*
# 4��. ������ ����
�ΰ��� ���ڸ� �Է��� �� ������ �ش�Ǵ� ������ �������� ����ϼ���.
���� 1) ���� �� ������ �ϳ��� 2 ~ 9 ������ ����� �ݺ����� ����Ͽ� �ٽ� �Է��ϰ� ���ּ���.
   �� ���� ��� �������� ����������� �������� ����� �� ���α׷��� ����˴ϴ�.
���� 2) �Է� ���� 7 4 ������� 4�ܺ��� 7�ܱ����� ������ּ���.
   4 7 �������� 4�� ~ 7�� ������ ������ּ���.
���� 3) �Է� ���� 4 4 �̸� 4�ܸ� ����ϸ� �˴ϴ�.

----- ���� -----
�� �� �Է�(2 ~ 9) : 11 7
������ �°� �ٽ� �Է����ּ���

�� �� �Է�(2 ~ 9) : 2 10
������ �°� �ٽ� �Է����ּ���

�� �� �Է�(2 ~ 9) : 7 4
4 * 1 = 4   5 * 1 = 5   6 * 1 = 6   7 * 1 = 7   
4 * 2 = 8   5 * 2 = 10   6 * 2 = 12   7 * 2 = 14   
4 * 3 = 12   5 * 3 = 15   6 * 3 = 18   7 * 3 = 21   
4 * 4 = 16   5 * 4 = 20   6 * 4 = 24   7 * 4 = 28   
4 * 5 = 20   5 * 5 = 25   6 * 5 = 30   7 * 5 = 35   
4 * 6 = 24   5 * 6 = 30   6 * 6 = 36   7 * 6 = 42   
4 * 7 = 28   5 * 7 = 35   6 * 7 = 42   7 * 7 = 49   
4 * 8 = 32   5 * 8 = 40   6 * 8 = 48   7 * 8 = 56   
4 * 9 = 36   5 * 9 = 45   6 * 9 = 54   7 * 9 = 63
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, result;
		
		while(true) {
			System.out.print("�� �� �Է�>>");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			if(2>num1||num1>9||2>num2||num2>9) {
				System.out.println("������ �°� �ٽ� �Է����ּ���");
				continue;
			}
			if(num2<num1) {
				int min=num2; int max=num1;
				num1=min; num2=max;
			}
			
			for(int i=1; i<=9; i++) {
				System.out.println(i);
				for(int j=num1; j<=num2; j++) {
					result=j*i;
					System.out.printf("%d*%d=%d\t",j,i,result);
				}
				System.out.println();
			}break;
		}
		
	}
}