package quiz_210810;

import java.util.Scanner;
//전우진 문제
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
			System.out.println("더 이상 온도를 올릴 수 없습니다.");
		}
	}
	public void tempDown() {
		this.temp -=1;
		System.out.println(getTemp());
		if(getTemp() >=18) {
			System.out.println("더 이상 온도를 내릴 수 없습니다.");
		}
	}

	public void humidUp() {
		double d = getHumid();
		System.out.println(getHumid());

		setHumid(d+=5);
		if(this.humid>=70) {
			setHumid(70);
			System.out.println("더 이상 습도를 올릴 수 없습니다");
		}
	}
	public void humidDown() {
		double d = getHumid();
		System.out.println(getHumid());
		setHumid(d-=5);
		if(getHumid()<=30) {
			setHumid(30);
			System.out.println("더 이상 습도를 내릴 수 없습니다");
		}
		
	}

	public void windUp() {
		int w = getStrWind();
		System.out.println(getStrWind());

		setStrWind(++w);
		if(getStrWind()>=5) {
			setStrWind(5);
			System.out.println("더 이상 세기를 강하게 할 수없습니다");
		}
		
	}
	public void windDown() {
		int w = getStrWind();
		System.out.println(getStrWind());

		setStrWind(--w);
		if(getStrWind()<=1) {
			setStrWind(1);
			System.out.println("더 이상 세기를 약하게 할 수 없습니다");
		}
		
	}
}

public class TeamQuiz01 {
	public static void main(String[] args) {
		int sel = 0;
		Scanner sc = new Scanner(System.in);
		AirConditioner air = new AirConditioner();
		while(true) {
			System.out.println("1.온도 올리기");
			System.out.println("2.온도 내리기");
			System.out.println("3.습도 올리기");
			System.out.println("4.습도 내리기");
			System.out.println("5.바람세기 올리기");
			System.out.println("6.바람세기 내리기");
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
