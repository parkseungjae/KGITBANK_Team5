import java.util.Scanner;

//01. �ڽ��� ����
public class quiz01_forA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 0;
		int j = 0;
		
		System.out.println("Ȧ���� �Է����ּ��� " );
		num = sc.nextInt();
		for(i =0; i<num; i++) {
			for( j=0 ; j<=num; j++) {
			if(i<=num/2) {
				if(i+j<=num/2-1)
					System.out.println(" ");
				else if(j-i>=num/2+1)
					System.out.println(" ");
				else
					System.out.print("*");
			}
			else if(i>num/2) {
				if(i-j>=num/2+1)
					System.out.println(" ");
				else if(i+j>=num/2*3+1)
					System.out.println(" ");
				else
					System.out.print("*");
			}
		}
		System.out.println();
	}

	}
}
