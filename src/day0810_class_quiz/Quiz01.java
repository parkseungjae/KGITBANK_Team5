package day0810_class_quiz;

import java.util.Scanner;

/*
# 1��. �ڽ��� ����
���� Ŭ������ �����Ͻÿ�
	�� �µ� ���(�⺻�µ��� 20��)
	- ���� +1��
	- �Ʒ��� -1��
	�� �ޱ� ���( �ִ� �뷮 100L)
	- �� Ʋ�� (Ʋ�������� 2���;� �þ�ϴ�)
	- �� ����
	- 100L�� �ʰ��� ���̻� �뷮�� �þ�� �ʽ��ϴ�.
	- �� ���� (2���;� �����մϴ�. 0�� �ɽ� ���̻� ���̾��ٴ� �޼����� ����մϴ�)
 */

class Bathtub{
	private int waterTemp = 20, waterLiter = 0;

	public void tempUp() {
		waterTemp = waterTemp + 1;
	}
	public void tempDown() {
		waterTemp = waterTemp - 1;
	}
	public void tempPrint() {
		System.out.println("���� ��ǥ �µ� : " + getWaterTemp() + "��");
	}
	public void waterLiterPrint() {
		System.out.println("���� �� �뷮 : " + getWaterLiter() + "L");
	}
	public void waterUp() {
		waterLiter = waterLiter + 2;
	}
	public void waterDown() {
		waterLiter = waterLiter - 2;
	}

	public int getWaterTemp() {
		return waterTemp;
	}
	public void setWaterTemp(int waterTemp) {
		this.waterTemp = waterTemp;
	}
	public int getWaterLiter() {
		return waterLiter;
	}
	public void setwaterLiter(int waterLiter) {
		this.waterLiter = waterLiter;
	}
}

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bathtub b = new Bathtub();
		int inputNum = 0, inputTempControl = 0, waterLiterControl = 0,
				time, cnt = 0;

		while(inputNum != 3) {
			System.out.println("1. �� �µ� ���� ���");
			System.out.println("2. �� �ޱ� ���");
			System.out.println("3. ���α׷� ����");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("=== �µ� ���� ===");
				b.tempPrint();

				while(inputTempControl != 3) {
					System.out.println("1. �µ� UP");
					System.out.println("3. �µ� DOWN");
					System.out.println("3. �µ� ���� ����");
					System.out.print(">>> ");
					inputTempControl = sc.nextInt();
					System.out.println();

					switch(inputTempControl) {
					case 1 :
						System.out.println("�µ� UP!!");
						b.tempUp();
						b.tempPrint();
						break;
					case 2 :
						System.out.println("�µ� DOWN!!");
						b.tempDown();
						b.tempPrint();
						break;
					case 3 :
						System.out.println("���� ����\n");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���\n");
					}
				}
				break;
			case 2 :
				System.out.println("=== �� �ޱ� ===");
				b.waterLiterPrint();

				while(waterLiterControl != 3) {
					System.out.println("1. �� Ʋ��");
					System.out.println("2. �� ����");
					System.out.println("3. ���� ����");
					System.out.print(">>> ");
					waterLiterControl = sc.nextInt();
					System.out.println();

					switch(waterLiterControl) {
					case 1 :
						System.out.println("=== �� Ʋ�� ===");
						System.out.print("���� �ð� �Է� : ");
						time = sc.nextInt();
						cnt = 0;
						while(time > cnt) {
							if(b.getWaterLiter() >= 100) {
								System.out.println("���� ���� á���ϴ�.\n");
								break;
							}
							b.waterUp();
							b.waterLiterPrint();
							try {
								Thread.sleep(1000);
							}catch(InterruptedException e) {}
							cnt++;
						}
						System.out.println();
						break;
					case 2 :
						System.out.println("=== �� ���� ===");
						while(b.getWaterLiter() > 0) {
							b.waterDown();
							b.waterLiterPrint();
							try {
								Thread.sleep(1000);
							}catch(InterruptedException e) {}
						}
						System.out.println("���̻� ���� �����ϴ�.\n");
						break;
					case 3 :
						System.out.println("���� ����\n");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���\n");
					}
				}				
				break;
			case 3 :
				System.out.println("���α׷� ����");
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}
