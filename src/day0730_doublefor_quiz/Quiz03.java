package day0730_doublefor_quiz;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		# 3��. ����� ����
		Console
		*********
		 *******
		  *****
		   ***
		    *
		   ***
		  *****
		 *******
		*********
		���� ���� �𷡽ð� ���°� �ǵ��� ���ּ���
		*/
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= 3-i+1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
