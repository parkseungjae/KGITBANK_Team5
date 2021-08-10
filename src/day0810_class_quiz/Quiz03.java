package day0810_class_quiz;

import java.util.Scanner;

/*
# 3번. 이주희 문제
클래스TV
기능 1. 채널 돌리기(위,아래 1칸씩 이동)
기능 2. 영화보기(무료, 유료. 유료일 경우 결제 필요)
기능 3. on,off

클래스와 메소드를 구분해서 이런기능이 있을것이다 정도를 적당히 상상해서 작성해주시면 됩니다!
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
		System.out.printf("현재 채널은 %d번 입니다.\n\n", channel);
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
		System.out.println("남은 돈 : " + getMoney() + "원");
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
					System.out.println("1. 채널 돌리기");
					System.out.println("2. 영화 보기");
					System.out.println("3. TV 전원 off");
					System.out.print(">>> ");
					inputNum = sc.nextInt();
					System.out.println();

					switch(inputNum) {
					case 1 :
						tv.channelPrint();
						while(channelChangeNum != 3) {
							System.out.println("=== 채널 돌리기 ===");
							System.out.println("1. 채널 UP");
							System.out.println("2. 채널 DOWN");
							System.out.println("3. 채널 조작 종료");
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
								System.out.println("채널 조작 종료");
								break;
							default : 
								System.out.println("다시 입력하세요\n");
							}
						}
						break;
					case 2 :
						System.out.println("=== 영화 보기 ===");
						System.out.println("1. 무료 영화");
						System.out.println("2. 유료 영화");
						System.out.println("3. 영화목록 나가기");
						System.out.print(">>> ");
						movieListNum = sc.nextInt();
						System.out.println();

						switch(movieListNum) {
						case 1 :
							System.out.println("=== 무료 영화 ===");
							System.out.println("1. 7광구");
							System.out.println("2. 8광구");
							System.out.println("3. 9광구");
							System.out.print(">>> ");
							zeroMoviesNum = sc.nextInt();
							System.out.println();

							switch(zeroMoviesNum) {
							case 1 :
								System.out.println("7광구 시작\n=\n=\n=\n끝\n");
								break;
							case 2 :
								System.out.println("8광구 시작\n=\n=\n=\n끝\n");
								break;
							case 3 :
								System.out.println("9광구 시작\n=\n=\n=\n끝\n");
								break;
							default :
								System.out.println("다시 입력해주세요\n");
							}
							break;
						case 2 : 
							System.out.println("=== 유료 영화 ===");
							System.out.println("1. 10광구(7,000원)");
							System.out.println("2. 11광구(8,000원)");
							System.out.println("3. 12광구(9,000원)");
							System.out.print(">>> ");
							nonZeroMoviesNum = sc.nextInt();
							System.out.println();

							switch(nonZeroMoviesNum) {
							case 1 :
								tenPrice = 7000;
								result = tv.moviePriceResult(tenPrice);
								if(result == 1) {
									System.out.println("돈 부족!\n");
									break;
								}else {
									System.out.println("결제 완료!\n");
									System.out.println("10광구 시작\n=\n=\n=\n끝");
									tv.moneyPrint();
									break;
								}
							case 2 :
								tenPrice = 8000;
								result = tv.moviePriceResult(tenPrice);
								if(result == 1) {
									System.out.println("돈 부족!\n");
									break;
								}else {
									System.out.println("결제 완료!\n");
									System.out.println("11광구 시작\n=\n=\n=\n끝");
									tv.moneyPrint();
									break;
								}
							case 3 :
								tenPrice = 9000;
								result = tv.moviePriceResult(tenPrice);
								if(result == 1) {
									System.out.println("돈 부족!\n");
									break;
								}else {
									System.out.println("결제 완료!\n");
									System.out.println("12광구 시작\n=\n=\n=\n끝");
									tv.moneyPrint();
									break;
								}
							}
							break;
						case 3 :
							System.out.println("영화 목록 나가기\n");
							break;
						default :
							System.out.println("다시 입력해주세요/n");
						}
						break;
					case 3 :
						System.out.println("TV 전원 off");
						break;
					default :
						System.out.println("다시 입력해주세요\n");
					}
				}
				break;
			}else if(power.equals("n")) {
				System.out.println("TV 전원을 안키겠습니다.");
				break;
			}else {
				System.out.println("다시 입력하세요\n");
			}
		}

	}
}
