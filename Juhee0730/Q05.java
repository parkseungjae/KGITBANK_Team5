package Juhee0730;

public class Q05 {
/*
# 5��. ������ ����
1 ~ 1000 ������ ���� ���Ͻÿ�.
�� 5�� ����� �����ϰ� 5�� ����̸鼭 8�� ����ΰ��� �������� �ʴ� �������� ���Ͻÿ�.
 */
	public static void main(String[] args) {
		int cnt, sum=0;
		
		for(cnt=1; cnt<=1000; cnt++) {
			if(cnt%5==0&&cnt%8!=0) {
				continue;
			}
			sum+=cnt;
			System.out.println("���� ��:"+cnt+"/��:"+sum);
		}
	}
}