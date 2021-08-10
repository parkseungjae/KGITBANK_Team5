package Juhee0810;

import java.util.Scanner;

public class TV {
	전원on/off(){
		if(on누름) {
			전원켜짐;
		}else(off누름){
			전원꺼짐;
		}
	}
	채널돌리기(int 채널){
		if(위) {
			채널++;
		}else if(아래) {
			채널--;
		}
	}
	
	영화보기(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.로맨스 / 2. 공포 / 3. 스릴러 / 4. 새드 / 5. 개그");
		int 선택 = scanner.nextInt();

		if(유료) {
			요금결제();
		}
		switch (선택) {
		case 1:
			재생(로맨스);
			break;
		case 2:
			재생(공포);
			break;
		case 3:
			재생(스릴러);
			break;
		case 4:
			재생(새드);
			break;
		case 5:
			재생(개그);
			break;
		default:
			재생(그외);
			break;
		}
		
	}
	재생(int 장르){
		선택한 영화 재생하기;
	}
	요금결제(int 요금){
		if(카드결제) {카드결제 방법;}else if(계좌이체) {이체할 은행 선택; 결제;}
	}
}
