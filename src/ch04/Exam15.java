package ch04;

import java.util.Scanner;

public class Exam15 {
//Ŭ������ �̸��� �����̸��̶� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
	
		//Ű���忡�� �Էµ� ���� �ޱ����ؼ� ���� ����. �ڼ��� ������ ���߿�
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//Ű���忡�� �Է��� ������ data������ ����
			//������ ���� �����°�?? ����ڰ� ����Ű ������ 
			System.out.print("�Է� : ");
			String data = scanner.nextLine();
			//data ������ ���� ��� 
			System.out.println("���: " + data);
		
			//��������
			//���ڿ��� ���� ���� data = "���ɽð�" �̷��� �� �ȵ�.
			//data.equals("") ��� ����ؾ��� 
			if(data.equals("���ɽð�")) {
				break;
			}
		}
	}
	
}
