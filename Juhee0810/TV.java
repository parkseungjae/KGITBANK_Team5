package Juhee0810;

import java.util.Scanner;

public class TV {
	����on/off(){
		if(on����) {
			��������;
		}else(off����){
			��������;
		}
	}
	ä�ε�����(int ä��){
		if(��) {
			ä��++;
		}else if(�Ʒ�) {
			ä��--;
		}
	}
	
	��ȭ����(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.�θǽ� / 2. ���� / 3. ������ / 4. ���� / 5. ����");
		int ���� = scanner.nextInt();

		if(����) {
			��ݰ���();
		}
		switch (����) {
		case 1:
			���(�θǽ�);
			break;
		case 2:
			���(����);
			break;
		case 3:
			���(������);
			break;
		case 4:
			���(����);
			break;
		case 5:
			���(����);
			break;
		default:
			���(�׿�);
			break;
		}
		
	}
	���(int �帣){
		������ ��ȭ ����ϱ�;
	}
	��ݰ���(int ���){
		if(ī�����) {ī����� ���;}else if(������ü) {��ü�� ���� ����; ����;}
	}
}
