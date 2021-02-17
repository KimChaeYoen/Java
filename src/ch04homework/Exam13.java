package ch04homework;

import java.io.IOException;

public class Exam13 {

	public static void main(String[] args) throws Exception {
		
		//키보드로 while문 제어
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("--------------");
				System.out.println("1.종속|2.감속|3.중지");
				System.out.println("---------------");
				System.out.println("선택");
			}
			
			keyCode = System.in.read();//키보드의 키 코드를 일긍ㅁ
			
			if(keyCode == 49) {//1을 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
			}else if(keyCode == 50) {
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if(keyCode == 51) {
				run = false; //while문을 종료하기 위해 run 변수에 false저장
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
