package ch04;

public class Exam08 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
	//���� �޼ҵ��~~~ 
		
		//�� ���⼭ ���� ������ ��������?
		int sum = 0;
		int i; //i�� ���⿡ �����ϸ� 
		//for�� �ȿ����� ��밡���ϰ�
		for(i=1;i<=10;i++) {
			int value = i;
			sum += value; //sum =+ i;
		}
		//for�� �ۿ����� ��밡���ϴ�
		System.out.println("1~" + i + ":" + sum);
	}
}
