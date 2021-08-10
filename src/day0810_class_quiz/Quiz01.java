package day0810_class_quiz;

import java.util.Scanner;

/*
# 1번. 박승재 문제
욕조 클래스를 생성하시오
	물 온도 기능(기본온도는 20도)
	- 위로 +1도
	- 아래로 -1도
	물 받기 기능( 최대 용량 100L)
	- 물 틀기 (틀고있을때 2리터씩 늘어납니다)
	- 물 끄기
	- 100L를 초과시 더이상 용량이 늘어나지 않습니다.
	- 물 빼기 (2리터씩 감소합니다. 0이 될시 더이상 물이없다는 메세지를 출력합니다)
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
		System.out.println("현재 목표 온도 : " + getWaterTemp() + "℃");
	}
	public void waterLiterPrint() {
		System.out.println("현재 물 용량 : " + getWaterLiter() + "L");
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
			System.out.println("1. 물 온도 조절 기능");
			System.out.println("2. 물 받기 기능");
			System.out.println("3. 프로그램 종료");
			System.out.print(">>> ");
			inputNum = sc.nextInt();
			System.out.println();

			switch(inputNum) {
			case 1 :
				System.out.println("=== 온도 조절 ===");
				b.tempPrint();

				while(inputTempControl != 3) {
					System.out.println("1. 온도 UP");
					System.out.println("3. 온도 DOWN");
					System.out.println("3. 온도 조작 종료");
					System.out.print(">>> ");
					inputTempControl = sc.nextInt();
					System.out.println();

					switch(inputTempControl) {
					case 1 :
						System.out.println("온도 UP!!");
						b.tempUp();
						b.tempPrint();
						break;
					case 2 :
						System.out.println("온도 DOWN!!");
						b.tempDown();
						b.tempPrint();
						break;
					case 3 :
						System.out.println("조작 종료\n");
						break;
					default :
						System.out.println("다시 입력하세요\n");
					}
				}
				break;
			case 2 :
				System.out.println("=== 물 받기 ===");
				b.waterLiterPrint();

				while(waterLiterControl != 3) {
					System.out.println("1. 물 틀기");
					System.out.println("2. 물 빼기");
					System.out.println("3. 조작 종료");
					System.out.print(">>> ");
					waterLiterControl = sc.nextInt();
					System.out.println();

					switch(waterLiterControl) {
					case 1 :
						System.out.println("=== 물 틀기 ===");
						System.out.print("받을 시간 입력 : ");
						time = sc.nextInt();
						cnt = 0;
						while(time > cnt) {
							if(b.getWaterLiter() >= 100) {
								System.out.println("믈이 가득 찼습니다.\n");
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
						System.out.println("=== 물 빼기 ===");
						while(b.getWaterLiter() > 0) {
							b.waterDown();
							b.waterLiterPrint();
							try {
								Thread.sleep(1000);
							}catch(InterruptedException e) {}
						}
						System.out.println("더이상 물이 없습니다.\n");
						break;
					case 3 :
						System.out.println("조작 종료\n");
						break;
					default :
						System.out.println("다시 입력하세요\n");
					}
				}				
				break;
			case 3 :
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("다시 입력하세요.\n");
			}
		}
	}
}
