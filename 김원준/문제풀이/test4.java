package day4__;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
	
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
		
		if(num1 <= num2 && num1 <= num3)
		{
			System.out.println("최소값 : "+ num1);
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.println("최소값 : " + num2);
		}	else if(num3 <= num1 && num3 <= num2) {
			System.out.println("최소값 : " + num3);
		}	

		


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