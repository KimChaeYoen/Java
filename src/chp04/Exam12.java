package chp04;

public class Exam12 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
	
		int count = 0;
		
		while(true) {
			count++;
			if(count%2 == 0) {
				continue; //continue�� ���⼭ ���߰� �ٽ� �������� ���ư���
			}
			System.out.println(count);
			if(count>10) {
				break; //�� �ݺ��� ���������
			}
		}
		System.out.println("���׷��� ������ ���� ����");
	}
	
}
