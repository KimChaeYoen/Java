package ch04;

public class Exam11 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
	
		int count = 0;
		
		while(true) {
			count++;
			System.out.println(count);
			if(count>10) {
				break; //�� �ݺ��� ���������
				//return; //return�� �ǹ̸� �޼ҵ� ��ü�� �����ض�. ���� �����ع���
			}
		}
		System.out.println("���׷��� ������ ���� ����");
	}
	
}
