package quiz_210810;

import java.util.Scanner;

class Bath{
	int water;
	double temp =20;
	
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void fillWater(int sec) {
		for(int i = 1; i <=sec; i++) {
			System.out.println(i+"초");
			this.water += 2;
			try {
                Thread.sleep(1000);
             }catch(InterruptedException e) {}
				if(this.water >= 100) {
					setWater(100);
					System.out.println("욕조가 가득찼습니다.");
					break;
			}
		}
		System.out.println("물이 " +getWater() + "L 있습니다.");
		
	}
	
	public void outWater(int sec) {
		for(int i = 1; i<=sec; i++) {
			try {
                Thread.sleep(1000);
             }catch(InterruptedException e) {}
			System.out.println(i+"초");
			this.water -=2;
			
			if(this.water <= 0) {
				setWater(0);
				System.out.println("욕조가 비었습니다.");
				break;
			}
		}
		System.out.println("물이 " +getWater() + "L 있습니다.");
		
	}
	
	public void upTemp() {
		this.temp +=1;
			if(getTemp() >= 70) {
			this.temp = 70;
			System.out.println("너무 뜨겁습니다 온도를 내려주세요.");
		}

		System.out.println("현재 수온 : " + getTemp());
	}
	public void downTemp() {
		this.temp -=1;
		if(getTemp() <= 0) {
			this.temp = 0;
			System.out.println("너무 차갑습니다 온도를 올려주세요.");
		}
		System.out.println("현재 수온 : " + getTemp());
		
	}
	public void chkTemp() {

		System.out.println("현재 수온 : " + getTemp());
	}
	
}


public class Myquiz01 {
	public static void main(String[] args) {
		Bath b = new Bath();
		Scanner sc = new Scanner(System.in);
		int select =0, sec = 0;
		while(true) {
			System.out.println("욕조가 있습니다 하실 기능을 선택해주세요");
			System.out.println("1.물 채우기\t2.물 비우기\t3.물 온도 올리기");
			System.out.println("4.물 온도 내리기\t5.물 온도 확인\t6.화장실 밖으로 나가기");
			
			select = sc.nextInt();
			switch(select) {
				case 1:
					System.out.println("채울 시간을 입력해주세요");
					sec = sc.nextInt();
					b.fillWater(sec);
					break;
				case 2:
					System.out.println("물을 비울 시간을 입력해주세요");
					sec = sc.nextInt();
					b.outWater(sec);
					break;
				case 3:
					b.upTemp();
					break;
				case 4:
					b.downTemp();
					break;
				case 5:
					b.chkTemp();
					break;
				case 6:
					System.out.println("화장실 밖으로 나갑니다.");
					System.exit(1);
			}
		}
	}
}
