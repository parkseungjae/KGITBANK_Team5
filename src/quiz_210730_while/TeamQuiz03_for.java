package quiz_210730_while;

import java.util.Scanner;

public class TeamQuiz03_for {
	//전우진 문제
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		
		while ((input1 < 2 || input1 > 9) || (input2 < 2 || input2 > 9)) {
			System.out.println("다시입력해주세요");
			input1 = in.nextInt();
			input2 = in.nextInt();
		}

		if (input1 > input2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input1; j >= input2; j--) {
					String result = Integer.toString(j * i);
					if (result.length() == 1) {
						System.out.print(j + " * " + i + " =  " + result + "   ");
					} else
						System.out.print(j + " * " + i + " = " + result + "   ");
				}
				System.out.println();
			}

		} else if (input2 > input1) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input1; j <= input2; j++) {
					String result = Integer.toString(j * i);
					if (result.length() == 1) {
						System.out.print(j + " * " + i + " =  " + result + "   ");
					} else
						System.out.print(j + " * " + i + " = " + result + "   ");
				}
				System.out.println();
			}
		} else if (input1 == input2) {
			for (int i = 1; i <= 9; i++) {
				String result = Integer.toString(input1 * i);
				if (result.length() == 1) {
					System.out.println(input1 + " * " + i + " =  " + result);
				} else
					System.out.println(input1 + " * " + i + " = " + result);
			}
		}
	}
}
