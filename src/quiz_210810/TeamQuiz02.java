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
		String fMov = "���῵ȭ", nonFMov = "���῵ȭ";	
		Scanner sc = new Scanner(System.in);
		int sel = 0 ;
		int sel2 = 0;
				while(true) {
						System.out.println("1.���῵ȭ\t2.���῵ȭ");
						System.out.print(">>>>>");
						sel = sc.nextInt();
						switch(sel) {
						case 1:
							while(true) {
							System.out.println(fMov + "�� ���῵ȭ�Դϴ� ��û�Ͻðڽ��ϱ�? Y(1)/N(2)");
							sel2 = sc.nextInt();
							switch(sel2) {
								case 1:
									System.out.println("��ȭ�� ��û�մϴ�.");
									break;
								case 2:
									System.out.println("��û���� �ʽ��ϴ�");
									break;
								}
							break;
							}
						case 2:
							while(true) {
								System.out.println(fMov + "�� ������ �ʿ��� �����Դϴ� �����Ͻðڽ��ϱ�? Y(1)/N(2)");
								sel2 = sc.nextInt();
								switch(sel2) {
									case 1:
										System.out.println("��ȭ�� ��û�մϴ�.");
									case 2:
										System.out.println("��û���� �ʽ��ϴ�");
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
			
		System.out.println("1. ä�� ����\t2.��ȭ����");
		System.out.println(">>>>");
		int select = sc.nextInt();
		int sel2=0;
		switch(select) {
		case 1: 
			System.out.println("1.ä�� �ø���\t2.ä�� ������");
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
