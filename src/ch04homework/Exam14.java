package ch04homework;

import java.io.IOException;

public class Exam14 {

	public static void main(String[] args) throws Exception {
		
		//�ٱ��� �ݺ��� ����
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower ='a'; lower<='z';lower++) {
				System.out.println(upper + "-" + lower);
				if(lower =='g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}
