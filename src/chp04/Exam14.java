package chp04;

import java.util.Scanner;

public class Exam14 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
	
		//Ű���忡�� �Էµ� ���� �ޱ����ؼ� ���� ����. �ڼ��� ������ ���߿�
		Scanner scanner = new Scanner(System.in);
		
		//�� 3���� �ݺ���
		for(int i = 0;i<3;i++) {
			//Ű���忡�� �Է��� ������ data������ ����
			//������ ���� �����°�?? ����ڰ� ����Ű ������ 
			System.out.print("�Է� : ");
			String data = scanner.nextLine();
			//data ������ ���� ��� 
			System.out.println("���: " + data);
		}
	}
	
}
