package day04_if;

import java.util.Scanner;

public class Quiz01_self {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//3���� ������ �Է¹޾� �ִ�,�ּ� ���� ����ϰ� �� ���� 3�� ������� Ȯ���϶�
		int num1;
		int num2;
		int num3;
		//�ִ밪
		System.out.println("�� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if(num1 >= num2 && num1 >= num3)
		{
			System.out.println("�ִ밪 : "+ num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("�ִ밪 : " + num2);
		}	else if (num3 >= num1 && num3 >= num2) {
			System.out.println("�ִ밪 : " + num3);
		}	
		//�ּҰ�
		if(num1 <= num2 && num1 <= num3)
		{
			System.out.println("�ּҰ� : "+ num1);
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("�ּҰ� : " + num2);
		}	else if(num3 <= num1 && num3 <= num2) {
			System.out.println("�ּҰ� : " + num3);
		}	
		
		//�ִ밪�� �ּҰ��� 3�� ����ΰ�
		
	
		if(num1 >= num2 && num1 >= num3 && num1%3==0)
		System.out.println("�ִ밪�� 3�� ����Դϴ�");
	    else if(num2 >= num1 && num2 >= num3 && num2%3==0)
			System.out.println("�ִ밪�� 3�� ����Դϴ�");
		else if(num3 >= num2 && num3 >= num1 && num3%3==0)
			System.out.println("�ִ밪�� 3�� ����Դϴ�");
		
		if(num1 <= num2 && num1 <= num3 && num1%3==0)
			System.out.println("�ּҰ��� 3�� ����Դϴ�");
		    else if(num2 <= num1 && num2 <= num3 && num2%3==0)
				System.out.println("�ּҰ��� 3�� ����Դϴ�");
			else if(num3 <= num2 && num3 <= num1 && num3%3==0)
				System.out.println("�ּҰ��� 3�� ����Դϴ�");
		
		if(num1 >= num2 && num1 >= num3 && num1%3!=0)
			System.out.println("�ִ밪�� 3�� ����� �ƴմϴ�");
		    else if(num2 >= num1 && num2 >= num3 && num2%3!=0)
				System.out.println("�ִ밪�� 3�� ����� �ƴմϴ�");
			else if(num3 >= num2 && num3 >= num1 && num3%3!=0)
				System.out.println("�ִ밪�� 3�� ����� �ƴմϴ�");
			
			if(num1 <= num2 && num1 <= num3 && num1%3!=0)
				System.out.println("�ּҰ��� 3�� ����� �ƴմϴ�");
			    else if(num2 <= num1 && num2 <= num3 && num2%3!=0)
					System.out.println("�ּҰ��� 3�� ����� �ƴմϴ�");
				else if(num3 <= num2 && num3 <= num1 && num3%3!=0)
					System.out.println("�ִ밪�� 3�� ������ƴմϴ�");
		
		
		
		
		
		
	}

}
