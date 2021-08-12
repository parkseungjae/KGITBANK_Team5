package day0810_class_quiz;

import java.util.Scanner;

/*
# 4번. 오성택 문제
라디오 클래스를 생성하시오
	주파수 조절 기능 
	- 채널 위로 +1
	- 채널 아래로 -1
	전원기능 
	- 전원 켜기
	- 전원 끄기
	볼륨 조절 기능
	- 볼륨 위로 +1
	- 볼륨 아래로 -1
*/

class Radio {
	private int channel = 10, volume = 7;
	
	public void channelUp() {
		channel += 1;
	}
	public void channelDown() {
		channel -= 1;
	}
	public void volumeUp() {
		volume += 1;
	}
	public void volumeDown() {
		volume -= 1;
	}
	public void channelPrint() {
		System.out.println("현재 채널 : " + channel);
	}
	public void volumePrint() {
		System.out.println("현재 볼륨 : " + volume);
	}

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}

public class Quiz04 {
	public static void main(String[] args) {
		Radio rd = new Radio();
		Scanner sc = new Scanner(System.in);
		String power;
		int funcNum = 0, channelNum = 0, volumeNum = 0;
		
		while(true) {
			System.out.print("라디오 on?(y/n) : ");
			power = sc.next();
			System.out.println();
			
			if(power.equals("y")) {
				while(funcNum != 3) {
					System.out.println("1. 주파수 조작 기능");
					System.out.println("2. 볼륨 조작 기능");
					System.out.println("3. Power Off");
					System.out.print(">>> ");
					funcNum = sc.nextInt();
					System.out.println();
					
					switch(funcNum) {
					case 1 :
						while(channelNum != 3) {
							System.out.println("=== 주파수 조작 기능 ===");
							System.out.println("1. 채널 UP");
							System.out.println("2. 채널 DOWN");
							System.out.println("3. 채널 조작 종료");
							System.out.print(">>> ");
							channelNum = sc.nextInt();
							System.out.println();
							
							switch(channelNum) {
							case 1 :
								rd.channelUp();
								rd.channelPrint();
								break;
							case 2 :
								rd.channelDown();
								rd.channelPrint();
								break;
							case 3 :
								System.out.println("채널 조작 종료\n");
								break;
							default :
								System.out.println("다시 입력하세요\n");
							}
						}
						break;
					case 2 :
						while(volumeNum != 3) {
							System.out.println("=== 볼륨 조작 기능 ===");
							System.out.println("1. 볼륨 UP");
							System.out.println("2. 볼륨 DOWN");
							System.out.println("3. 볼륨 조작 종료");
							System.out.print(">>> ");
							volumeNum = sc.nextInt();
							System.out.println();
							
							switch(volumeNum) {
							case 1 :
								rd.volumeUp();
								rd.volumePrint();
								break;
							case 2 :
								rd.volumeDown();
								rd.volumePrint();
								break;
							case 3 :
								System.out.println("볼륨 조작 종료\n");
								break;
							default :
								System.out.println("다시 입력하세요\n");
							}
						}
						break;
					case 3 :
						System.out.println("=== Power Off ===");
						break;
					default :
						System.out.println("다시 입력하세요\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("라디오 전원을 키지 않습니다.");
				break;
			}else {
				System.out.println("다시 입력하세요\n");
			}
		}
	}
}
