package ch04homework;

import java.io.IOException;

public class Exam13 {

	public static void main(String[] args) throws Exception {
		
		//Ű����� while�� ����
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("--------------");
				System.out.println("1.����|2.����|3.����");
				System.out.println("---------------");
				System.out.println("����");
			}
			
			keyCode = System.in.read();//Ű������ Ű �ڵ带 �ϱऱ
			
			if(keyCode == 49) {//1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			}else if(keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			}else if(keyCode == 51) {
				run = false; //while���� �����ϱ� ���� run ������ false����
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
