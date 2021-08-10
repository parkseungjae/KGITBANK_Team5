package day0810_class_quiz;

import java.util.Scanner;

/*
# 2��. ������ ����
������ Ŭ������ �����ϼ���.
   �ù� ���(18 ~ 30��, �ʱ� �µ� 25��)
   - +1��
   - -1��
   ���� ���(30 ~ 70 %, �ʱ� ���� 50%)
   - +5%
   - -5%
   ��ǳ ���(1 ~ 5�ܰ�, �ʱ� �ٶ����� 2�ܰ�)
   - +1�ܰ�
   - -1�ܰ�
 */

class AirConditioner {
	private int temp = 25, hum = 50, wind = 2;
	
	public void tempUp() {
		if(temp >= 18 && temp < 30)
			temp = temp + 1;
	}
	public void tempDown() {
		if(temp > 18 && temp <= 30)
			temp = temp - 1;
	}
	public void humUp() {
		if(hum >= 30 && hum < 70)
			hum = hum + 5;
	}
	public void humDown() {
		if(hum > 30 && hum <= 70)
			hum = hum - 5;
	}
	public void windUp() {
		if(wind >= 1 && wind < 5)
			this.wind = wind + 1;
	}
	public void windDown() {
		if(wind > 1 && wind <= 5)
			wind = wind - 1;
	}
	public void tempPrint() {
		System.out.println("���� ��ǥ �µ� : " + getTemp() + "��");
	}
	public void humPrint() {
		System.out.println("���� ��ǥ ���� : " + getHum() + "%");
	}
	public void windPrint() {
		System.out.println("���� ��ǥ �ٶ����� : " + getWind() + "�ܰ�");
	}
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public int getWind() {
		return wind;
	}
	public void setWind(int wind) {
		this.wind = wind;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AirConditioner ac = new AirConditioner();
		String power;
		int inputNum = 0, inputTempControl = 0, inputHumControl = 0,
				inputWindControl = 0;

		while(true) {
			System.out.print("������ on?(y/n): ");
			power = sc.next();
			if(power.equals("y")) {
				System.out.println();
				while(inputNum != 4) {
					System.out.println("1. �ù�");
					System.out.println("2. ����");
					System.out.println("3. ��ǳ");
					System.out.println("4. ���� off");
					System.out.print(">>> ");
					inputNum = sc.nextInt();
					System.out.println();

					switch(inputNum) {
					case 1 :
						System.out.println("=== �ù� ===");
						ac.tempPrint();
						while(inputTempControl != 3) {
							System.out.println("1. �µ� UP");
							System.out.println("2. �µ� DOWN");
							System.out.println("3. ���� ����");
							System.out.print(">>> ");
							inputTempControl = sc.nextInt();
							System.out.println();
							
							switch(inputTempControl) {
							case 1 :
								ac.tempUp();
								ac.tempPrint();
								break;
							case 2 :
								ac.tempDown();
								ac.tempPrint();
								break;
							case 3 :
								System.out.println("�µ� ���� ����\n");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���.");
							}
						}
						break;
					case 2 :
						System.out.println("=== ���� ===");
						ac.humPrint();
						while(inputHumControl != 3) {
							System.out.println("1. ���� UP");
							System.out.println("2. ���� DOWN");
							System.out.println("3. ���� ����");
							System.out.print(">>> ");
							inputHumControl = sc.nextInt();
							System.out.println();
							
							switch(inputHumControl) {
							case 1 :
								ac.humUp();
								ac.humPrint();
								break;
							case 2 :
								ac.humDown();
								ac.humPrint();
								break;
							case 3 :
								System.out.println("���� ���� ����\n");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���.");
							}
						}
						break;
					case 3 :
						System.out.println("=== ��ǳ ===");
						ac.windPrint();
						while(inputWindControl != 3) {
							System.out.println("1. ��ǳ UP");
							System.out.println("2. ��ǳ DOWN");
							System.out.println("3. ���� ����");
							System.out.print(">>> ");
							inputWindControl = sc.nextInt();
							System.out.println();
							
							switch(inputWindControl) {
							case 1 :
								ac.windUp();
								ac.windPrint();
								break;
							case 2 :
								ac.windDown();
								ac.windPrint();
								break;
							case 3 :
								System.out.println("��ǳ ���� ����\n");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���.");
							}
						}
						break;
					case 4 :
						System.out.println("������ ���� off");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���.\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("������ Ű���ʰڽ��ϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���.\n");
			}
		}
	}
}
