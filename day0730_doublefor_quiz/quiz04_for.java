import java.util.Scanner;

//04.전우진 문제
public class quiz04_for {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1=0;
	int num2=0;
	int max=0;
	int min=0;
	
	while(true) {
		System.out.println("두 수 입력(2~9) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if((num1 >= 2 && num1 <= 9 ) && (num2 >= 2 && num2<=9))
			break;
		System.out.println("범위에 맞게 다시 입력해 주세요\n");
	}
	if(num1>num2) {
		max = num1;
		min = num2;
		}else if(num2>num1) {
			max = num2;
			min = num1;
		}else {
			max = num1;
			min = num1;
		}
for(int i = 1; i<=9 ; i++) {
	for(int j = min; j<=max; j++) {
		System.out.print(j+"*"+i+"="+j*i+"\t");
	}
	System.out.println();
}
}
}
