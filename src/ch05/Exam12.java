package ch05;

import java.util.Arrays;

public class Exam12 {

	public static void main(String[] args) {
	
		Season nowSeason = Season.WINTER;
		if(nowSeason  == Season.SUMMER) {
			System.out.println("�½��ϴ�");
		}else {
			System.out.println("�ƴմϴ�");
		}
		
		
		Loginresult loginResult = Loginresult.FAILURE_ID;
		if(loginResult == Loginresult.SUCCESS) {
			System.out.println("�α��� ����");
		}else if(loginResult == Loginresult.FAILURE_ID) {

			System.out.println("ID�� �ٽ� �Է��ϼ���");
		}else {
			System.out.println("�н����尡 Ʋ���ϴ�.");
		}
		
	}

}
