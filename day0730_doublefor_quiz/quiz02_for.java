import java.util.Scanner;

//02. ������ ����
public class quiz02_for {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 
	int won =10;
	
	for(int day = 1 ;day<=30 ; day++) {
		if( day ==1) {
			won = 10;
		}else {
			won = won+10 ;
		}
		System.out.println(day+" "+won);
	

	
	
}
	System.out.println("30��° ������ �ݾ� : "+won);
}
}