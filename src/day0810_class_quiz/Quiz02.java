package day0810_class_quiz;

import java.util.Scanner;

/*
# 2��. ������ ����
������ Ŭ������ �����ϼ���.
   �ù� ���(18 ~ 30��, �ʱⰪ 25��)
   - +1��
   - -1��
   ���� ���(30 ~ 70 %, �ʱⰪ 50%)
   - +5%
   - -5%
   ��ǳ ���(1 ~ 5�ܰ�, �ʱⰪ 2�ܰ�)
   - +1�ܰ�
   - -1�ܰ�
 */

class AirConditioner {
	private int temp = 25, hum = 50, wind = 2;
	
	public void tempUp() {
		if(this.temp >= 18 && this.temp < 30)
			this.temp = temp + 1;
	}
	
	public void tempDown() {
		if(this.temp > 18 && this.temp <= 30)
			this.temp = temp - 1;
	}
	
	public void humUp() {
		if(this.hum >= 30 && this.hum < 70)
			this.hum = hum + 5;
	}
	
	public void humDown() {
		if(this.hum > 30 && this.hum <= 70)
			this.hum = hum - 5;
	}
	
	public void windUp() {
		if(this.wind >= 1 && this.wind < 5)
			this.wind = wind + 1;
	}
	
	public void windDown() {
		if(this.wind > 1 && this.wind <= 5)
			this.wind = wind - 1;
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
		int inputNum = 0, inputTempControl = 0, inputHumControl = 0, inputWindControl = 0;

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
						System.out.println("���� ��ǥ �µ� : " + ac.getTemp());
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
								System.out.println("���� ��ǥ �µ� : " + ac.getTemp());
								break;
							case 2 :
								ac.tempDown();
								System.out.println("���� ��ǥ �µ� : " + ac.getTemp());
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
						System.out.println("���� ��ǥ ���� : " + ac.getHum() + "%");
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
								System.out.println("���� ��ǥ ���� : " + ac.getHum() + "%");
								break;
							case 2 :
								ac.humDown();
								System.out.println("���� ��ǥ ���� : " + ac.getHum() + "%");
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
						System.out.println("���� ��ǥ ��ǳ : " + ac.getWind() + "�ܰ�");
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
								System.out.println("���� ��ǥ ��ǳ : " + ac.getWind() + "�ܰ�");
								break;
							case 2 :
								ac.windDown();
								System.out.println("���� ��ǥ ��ǳ : " + ac.getWind() + "�ܰ�");
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
