package day0810_class_quiz;

import java.util.Scanner;

/*
# 2번. 전우진 문제
에어컨 클래스를 생성하세요.
   냉방 기능(18 ~ 30도, 초기값 25도)
   - +1도
   - -1도
   제습 기능(30 ~ 70 %, 초기값 50%)
   - +5%
   - -5%
   송풍 기능(1 ~ 5단계, 초기값 2단계)
   - +1단계
   - -1단계
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
			System.out.print("에어컨 on?(y/n): ");
			power = sc.next();
			if(power.equals("y")) {
				System.out.println();
				while(inputNum != 4) {
					System.out.println("1. 냉방");
					System.out.println("2. 제습");
					System.out.println("3. 송풍");
					System.out.println("4. 전원 off");
					System.out.print(">>> ");
					inputNum = sc.nextInt();
					System.out.println();

					switch(inputNum) {
					case 1 :
						System.out.println("=== 냉방 ===");
						System.out.println("현재 목표 온도 : " + ac.getTemp());
						while(inputTempControl != 3) {
							System.out.println("1. 온도 UP");
							System.out.println("2. 온도 DOWN");
							System.out.println("3. 조작 종료");
							System.out.print(">>> ");
							inputTempControl = sc.nextInt();
							System.out.println();
							
							switch(inputTempControl) {
							case 1 :
								ac.tempUp();
								System.out.println("현재 목표 온도 : " + ac.getTemp());
								break;
							case 2 :
								ac.tempDown();
								System.out.println("현재 목표 온도 : " + ac.getTemp());
								break;
							case 3 :
								System.out.println("온도 조작 종료\n");
								break;
							default : 
								System.out.println("다시 입력하세요.");
							}
						}
						break;
					case 2 :
						System.out.println("=== 제습 ===");
						System.out.println("현재 목표 습도 : " + ac.getHum() + "%");
						while(inputHumControl != 3) {
							System.out.println("1. 습도 UP");
							System.out.println("2. 습도 DOWN");
							System.out.println("3. 조작 종료");
							System.out.print(">>> ");
							inputHumControl = sc.nextInt();
							System.out.println();
							
							switch(inputHumControl) {
							case 1 :
								ac.humUp();
								System.out.println("현재 목표 습도 : " + ac.getHum() + "%");
								break;
							case 2 :
								ac.humDown();
								System.out.println("현재 목표 습도 : " + ac.getHum() + "%");
								break;
							case 3 :
								System.out.println("습도 조작 종료\n");
								break;
							default : 
								System.out.println("다시 입력하세요.");
							}
						}
						break;
					case 3 :
						System.out.println("=== 송풍 ===");
						System.out.println("현재 목표 송풍 : " + ac.getWind() + "단계");
						while(inputWindControl != 3) {
							System.out.println("1. 송풍 UP");
							System.out.println("2. 송풍 DOWN");
							System.out.println("3. 조작 종료");
							System.out.print(">>> ");
							inputWindControl = sc.nextInt();
							System.out.println();
							
							switch(inputWindControl) {
							case 1 :
								ac.windUp();
								System.out.println("현재 목표 송풍 : " + ac.getWind() + "단계");
								break;
							case 2 :
								ac.windDown();
								System.out.println("현재 목표 송풍 : " + ac.getWind() + "단계");
								break;
							case 3 :
								System.out.println("송풍 조작 종료\n");
								break;
							default : 
								System.out.println("다시 입력하세요.");
							}
						}
						break;
					case 4 :
						System.out.println("에어컨 전원 off");
						break;
					default :
						System.out.println("다시 입력하세요.\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("전원을 키지않겠습니다.");
				break;
			}else {
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}
