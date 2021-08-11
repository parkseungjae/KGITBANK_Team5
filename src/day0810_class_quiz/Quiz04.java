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
	
}

public class Quiz04 {
	public static void main(String[] args) {
		Radio rd = new Radio();
		Scanner sc = new Scanner(System.in);
		String power;
		
		while(true) {
			System.out.print("라디오 on?(y/n) : ");
			power = sc.next();
			System.out.println();
			
			if(power.equals("y")) {
				
				System.out.println("1. 주파수 조작 기능");
				System.out.println("2. 볼륨 조작 기능");
				System.out.println("3. Power Off");
				
			}else if(power.equals("n")) {
				System.out.println("라디오 전원을 키지 않습니다.");
				break;
			}else {
				System.out.println("다시 입력하세요\n");
			}
		}
	}
}
