package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
	
		int[]  scores1 = {90, 85, 95};
		int[]  scores2 = {90, 85, 95};
		int[]  scores3 = scores1; //scores1�� �ּҰ� ����Ǿ� scores3�� ��
		
		
		//���⼭ ==�� �ǹ̴� ���� ���� �ȿ� �ֽ��ϱ��� �ǹ��� 
		System.out.println(scores1 == scores2);//false
		System.out.println(scores1 == scores3);//true
	}

}
