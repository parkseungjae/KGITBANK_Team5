package day0810_class_quiz;

import java.util.Scanner;

/*
# 3��. ������ ����
Ŭ����TV
��� 1. ä�� ������(��,�Ʒ� 1ĭ�� �̵�)
��� 2. ��ȭ����(����, ����. ������ ��� ���� �ʿ�)
��� 3. on,off

Ŭ������ �޼ҵ带 �����ؼ� �̷������ �������̴� ������ ������ ����ؼ� �ۼ����ֽø� �˴ϴ�!
 */

class Tv {
	private int channel = 5, money = 30000;

	public void channelUp() {
		channel += 1;
	}
	public void channelDown() {
		channel -= 1;
	}
	public void channelPrint() {
		System.out.printf("���� ä���� %d�� �Դϴ�.\n\n", channel);
	}
	public int moviePriceResult(int price) {
		if(money < price) {
			return 1;
		}else {
			money -= price;
			return 0;
		}
	}
	public void moneyPrint() {
		System.out.println("���� �� : " + getMoney() + "��");
	}

	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv();
		String power;
		int inputNum = 0, channelChangeNum = 0, movieListNum = 0,
				zeroMoviesNum = 0, nonZeroMoviesNum = 0, tenPrice, result;

		while(true) {
			System.out.print("Tv On?(y/n) : ");
			power = sc.next();
			System.out.println();

			if(power.equals("y")) {
				while(inputNum != 3) {
					System.out.println("1. ä�� ������");
					System.out.println("2. ��ȭ ����");
					System.out.println("3. TV ���� off");
					System.out.print(">>> ");
					inputNum = sc.nextInt();
					System.out.println();

					switch(inputNum) {
					case 1 :
						tv.channelPrint();
						while(channelChangeNum != 3) {
							System.out.println("=== ä�� ������ ===");
							System.out.println("1. ä�� UP");
							System.out.println("2. ä�� DOWN");
							System.out.println("3. ä�� ���� ����");
							System.out.print(">>> ");
							channelChangeNum = sc.nextInt();
							System.out.println();

							switch(channelChangeNum) {
							case 1 :
								tv.channelUp();
								tv.channelPrint();
								break;
							case 2 :
								tv.channelDown();
								tv.channelPrint();
								break;
							case 3 :
								System.out.println("ä�� ���� ����");
								break;
							default : 
								System.out.println("�ٽ� �Է��ϼ���\n");
							}
						}
						break;
					case 2 :
						System.out.println("=== ��ȭ ���� ===");
						System.out.println("1. ���� ��ȭ");
						System.out.println("2. ���� ��ȭ");
						System.out.println("3. ��ȭ��� ������");
						System.out.print(">>> ");
						movieListNum = sc.nextInt();
						System.out.println();

						switch(movieListNum) {
						case 1 :
							System.out.println("=== ���� ��ȭ ===");
							System.out.println("1. 7����");
							System.out.println("2. 8����");
							System.out.println("3. 9����");
							System.out.print(">>> ");
							zeroMoviesNum = sc.nextInt();
							System.out.println();

							switch(zeroMoviesNum) {
							case 1 :
								System.out.println("7���� ����\n=\n=\n=\n��\n");
								break;
							case 2 :
								System.out.println("8���� ����\n=\n=\n=\n��\n");
								break;
							case 3 :
								System.out.println("9���� ����\n=\n=\n=\n��\n");
								break;
							default :
								System.out.println("�ٽ� �Է����ּ���\n");
							}
							break;
						case 2 : 
							System.out.println("=== ���� ��ȭ ===");
							System.out.println("1. 10����(7,000��)");
							System.out.println("2. 11����(8,000��)");
							System.out.println("3. 12����(9,000��)");
							System.out.print(">>> ");
							nonZeroMoviesNum = sc.nextInt();
							System.out.println();

							switch(nonZeroMoviesNum) {
							case 1 :
								tenPrice = 7000;
								result = tv.moviePriceResult(tenPrice);
								if(result == 1) {
									System.out.println("�� ����!\n");
									break;
								}else {
									System.out.println("���� �Ϸ�!\n");
									System.out.println("10���� ����\n=\n=\n=\n��");
									tv.moneyPrint();
									break;
								}
							case 2 :
								tenPrice = 8000;
								result = tv.moviePriceResult(tenPrice);
								if(result == 1) {
									System.out.println("�� ����!\n");
									break;
								}else {
									System.out.println("���� �Ϸ�!\n");
									System.out.println("11���� ����\n=\n=\n=\n��");
									tv.moneyPrint();
									break;
								}
							case 3 :
								tenPrice = 9000;
								result = tv.moviePriceResult(tenPrice);
								if(result == 1) {
									System.out.println("�� ����!\n");
									break;
								}else {
									System.out.println("���� �Ϸ�!\n");
									System.out.println("12���� ����\n=\n=\n=\n��");
									tv.moneyPrint();
									break;
								}
							}
							break;
						case 3 :
							System.out.println("��ȭ ��� ������\n");
							break;
						default :
							System.out.println("�ٽ� �Է����ּ���/n");
						}
						break;
					case 3 :
						System.out.println("TV ���� off");
						break;
					default :
						System.out.println("�ٽ� �Է����ּ���\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("TV ������ ��Ű�ڽ��ϴ�.");
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���\n");
			}
		}

	}
}
