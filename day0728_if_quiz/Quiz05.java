package day04_if;

import java.util.Scanner;

public class Quiz01_self {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//3개의 정수를 입력받아 최대,최소 값을 출력하고 그 수가 3의 배수인지 확인하라
		int num1;
		int num2;
		int num3;
		//최대값
		System.out.println("수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if(num1 >= num2 && num1 >= num3)
		{
			System.out.println("최대값 : "+ num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("최대값 : " + num2);
		}	else if (num3 >= num1 && num3 >= num2) {
			System.out.println("최대값 : " + num3);
		}	
		//최소값
		if(num1 <= num2 && num1 <= num3)
		{
			System.out.println("최소값 : "+ num1);
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("최소값 : " + num2);
		}	else if(num3 <= num1 && num3 <= num2) {
			System.out.println("최소값 : " + num3);
		}	
		
		//최대값과 최소값이 3의 배수인가
		
	
		if(num1 >= num2 && num1 >= num3 && num1%3==0)
		System.out.println("최대값은 3의 배수입니다");
	    else if(num2 >= num1 && num2 >= num3 && num2%3==0)
			System.out.println("최대값은 3의 배수입니다");
		else if(num3 >= num2 && num3 >= num1 && num3%3==0)
			System.out.println("최대값은 3의 배수입니다");
		
		if(num1 <= num2 && num1 <= num3 && num1%3==0)
			System.out.println("최소값은 3의 배수입니다");
		    else if(num2 <= num1 && num2 <= num3 && num2%3==0)
				System.out.println("최소값은 3의 배수입니다");
			else if(num3 <= num2 && num3 <= num1 && num3%3==0)
				System.out.println("최소값은 3의 배수입니다");
		
		if(num1 >= num2 && num1 >= num3 && num1%3!=0)
			System.out.println("최대값은 3의 배수가 아닙니다");
		    else if(num2 >= num1 && num2 >= num3 && num2%3!=0)
				System.out.println("최대값은 3의 배수가 아닙니다");
			else if(num3 >= num2 && num3 >= num1 && num3%3!=0)
				System.out.println("최대값은 3의 배수가 아닙니다");
			
			if(num1 <= num2 && num1 <= num3 && num1%3!=0)
				System.out.println("최소값은 3의 배수가 아닙니다");
			    else if(num2 <= num1 && num2 <= num3 && num2%3!=0)
					System.out.println("최소값은 3의 배수가 아닙니다");
				else if(num3 <= num2 && num3 <= num1 && num3%3!=0)
					System.out.println("최대값은 3의 배수가아닙니다");
		
		
		
		
		
		
	}

}
