package quiz_210810;

import java.util.Scanner;
//������ ����
class AirConditioner{
	
	private double temp = 25;
	private double humid = 50;
	private int strWind = 2;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getHumid() {
		return humid;
	}
	public void setHumid(double humid) {
		this.humid = humid;
	}
	public int getStrWind() {
		return strWind;
	}
	public void setStrWind(int strWind) {
		this.strWind = strWind;
	}
	
	public void tempUp() {
		this.temp +=1;
		System.out.println(getTemp());
		if(getTemp() <=30) {
			System.out.println("�� �̻� �µ��� �ø� �� �����ϴ�.");
		}
	}
	public void tempDown() {
		this.temp -=1;
		System.out.println(getTemp());
		if(getTemp() >=18) {
			System.out.println("�� �̻� �µ��� ���� �� �����ϴ�.");
		}
	}

	public void humidUp() {
		double d = getHumid();
		System.out.println(getHumid());

		setHumid(d+=5);
		if(this.humid>=70) {
			setHumid(70);
			System.out.println("�� �̻� ������ �ø� �� �����ϴ�");
		}
	}
	public void humidDown() {
		double d = getHumid();
		System.out.println(getHumid());
		setHumid(d-=5);
		if(getHumid()<=30) {
			setHumid(30);
			System.out.println("�� �̻� ������ ���� �� �����ϴ�");
		}
		
	}

	public void windUp() {
		int w = getStrWind();
		System.out.println(getStrWind());

		setStrWind(++w);
		if(getStrWind()>=5) {
			setStrWind(5);
			System.out.println("�� �̻� ���⸦ ���ϰ� �� �������ϴ�");
		}
		
	}
	public void windDown() {
		int w = getStrWind();
		System.out.println(getStrWind());

		setStrWind(--w);
		if(getStrWind()<=1) {
			setStrWind(1);
			System.out.println("�� �̻� ���⸦ ���ϰ� �� �� �����ϴ�");
		}
		
	}
}

public class TeamQuiz01 {
	public static void main(String[] args) {
		int sel = 0;
		Scanner sc = new Scanner(System.in);
		AirConditioner air = new AirConditioner();
		while(true) {
			System.out.println("1.�µ� �ø���");
			System.out.println("2.�µ� ������");
			System.out.println("3.���� �ø���");
			System.out.println("4.���� ������");
			System.out.println("5.�ٶ����� �ø���");
			System.out.println("6.�ٶ����� ������");
			sel = sc.nextInt();
			switch(sel) {
			case 1:
				air.tempUp();
				break;
			case 2:
				air.tempDown();
				break;
				
			case 3:
				air.humidUp();
				break;
				
			case 4:
				air.humidDown();
				break;
				
			case 5:
				air.windUp();
				break;
				
			case 6:
				air.windDown();
				break;
			
			
			}
		}
	}

}
