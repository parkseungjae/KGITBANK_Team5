package day06_while;
//�������� 1~1000������ ���� ���Ͻÿ� 
//�� 5�� ����� �����ϰ� 5�� ����̸鼭 8�� ����ΰ��� �������� �ʴ� �������� ���Ͻÿ�
public class QuizG {
	public static void main(String[] args) {
		
		int i;
		int sum =0;
		int sum1 =0;
		
	  for(i=1 ; i<=1000; i++) {
		  if(i%5==0 && i%8!=0)
			  sum1+=i;
		  sum+=i;
	  }
				sum= sum-sum1;
				System.out.println(sum);
		
		
	}
}
//����� 413000