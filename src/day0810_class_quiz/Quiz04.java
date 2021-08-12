package day0810_class_quiz;

import java.util.Scanner;

/*
# 4��. ������ ����
���� Ŭ������ �����Ͻÿ�
	���ļ� ���� ��� 
	- ä�� ���� +1
	- ä�� �Ʒ��� -1
	������� 
	- ���� �ѱ�
	- ���� ����
	���� ���� ���
	- ���� ���� +1
	- ���� �Ʒ��� -1
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
		System.out.println("���� ä�� : " + channel);
	}
	public void volumePrint() {
		System.out.println("���� ���� : " + volume);
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
			System.out.print("���� on?(y/n) : ");
			power = sc.next();
			System.out.println();
			
			if(power.equals("y")) {
				while(funcNum != 3) {
					System.out.println("1. ���ļ� ���� ���");
					System.out.println("2. ���� ���� ���");
					System.out.println("3. Power Off");
					System.out.print(">>> ");
					funcNum = sc.nextInt();
					System.out.println();
					
					switch(funcNum) {
					case 1 :
						while(channelNum != 3) {
							System.out.println("=== ���ļ� ���� ��� ===");
							System.out.println("1. ä�� UP");
							System.out.println("2. ä�� DOWN");
							System.out.println("3. ä�� ���� ����");
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
								System.out.println("ä�� ���� ����\n");
								break;
							default :
								System.out.println("�ٽ� �Է��ϼ���\n");
							}
						}
						break;
					case 2 :
						while(volumeNum != 3) {
							System.out.println("=== ���� ���� ��� ===");
							System.out.println("1. ���� UP");
							System.out.println("2. ���� DOWN");
							System.out.println("3. ���� ���� ����");
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
								System.out.println("���� ���� ����\n");
								break;
							default :
								System.out.println("�ٽ� �Է��ϼ���\n");
							}
						}
						break;
					case 3 :
						System.out.println("=== Power Off ===");
						break;
					default :
						System.out.println("�ٽ� �Է��ϼ���\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("���� ������ Ű�� �ʽ��ϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���\n");
			}
		}
	}
}
