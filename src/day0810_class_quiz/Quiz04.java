package day0810_class_quiz;

import java.util.Scanner;

/*
# 4��. ������ ����
���� Ŭ������ �����Ͻÿ�
	���ļ� ���� ��� 
	- ä�� ���� +1
	- ä�� �Ʒ��� -1
	������� 
	- ���� �ѱ�
	- ���� ����
	���� ���� ���
	- ���� ���� +1
	- ���� �Ʒ��� -1
*/

class Radio {
	
}

public class Quiz04 {
	public static void main(String[] args) {
		Radio rd = new Radio();
		Scanner sc = new Scanner(System.in);
		String power;
		
		while(true) {
			System.out.print("���� on?(y/n) : ");
			power = sc.next();
			System.out.println();
			
			if(power.equals("y")) {
				
				System.out.println("1. ���ļ� ���� ���");
				System.out.println("2. ���� ���� ���");
				System.out.println("3. Power Off");
				
			}else if(power.equals("n")) {
				System.out.println("���� ������ Ű�� �ʽ��ϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���\n");
			}
		}
	}
}
