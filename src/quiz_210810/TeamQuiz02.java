package quiz_210810;

import java.util.Scanner;

class Tv{
	private int channel = 1;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void turnChan(int select) {
		int val = 1;
		if( select == 1) {
			this.channel+=1;
			if(this.channel > 100) {
				this.channel = 1;
			}
		}else if(select == 2) {
			this.channel-=1;
			if(this.channel <1) {
				this.channel = 100;
			}
		}
		
	}
	
	public void movie() {
		String fMov = "무료영화", nonFMov = "유료영화";	
		Scanner sc = new Scanner(System.in);
		int sel = 0 ;
		int sel2 = 0;
				while(true) {
						System.out.println("1.무료영화\t2.유료영화");
						System.out.print(">>>>>");
						sel = sc.nextInt();
						switch(sel) {
						case 1:
							while(true) {
							System.out.println(fMov + "는 무료영화입니다 시청하시겠습니까? Y(1)/N(2)");
							sel2 = sc.nextInt();
							switch(sel2) {
								case 1:
									System.out.println("영화를 시청합니다.");
									break;
								case 2:
									System.out.println("시청하지 않습니다");
									break;
								}
							break;
							}
						case 2:
							while(true) {
								System.out.println(fMov + "는 결제가 필요한 서비스입니다 결제하시겠습니까? Y(1)/N(2)");
								sel2 = sc.nextInt();
								switch(sel2) {
									case 1:
										System.out.println("영화를 시청합니다.");
									case 2:
										System.out.println("시청하지 않습니다");
									}
								break;
								}							
						}
							
				}
		}
}
public class TeamQuiz02 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		System.out.println("1. 채널 조정\t2.영화보기");
		System.out.println(">>>>");
		int select = sc.nextInt();
		int sel2=0;
		switch(select) {
		case 1: 
			System.out.println("1.채널 올리기\t2.채널 내리기");
			sel2 = sc.nextInt();
			t.turnChan(sel2);
			System.out.println(t.getChannel());
		
		break;
		case 2: 
			t.movie();
		break;
		}	}
	}
}
