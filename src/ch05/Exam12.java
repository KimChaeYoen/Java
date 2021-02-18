package ch05;

import java.util.Arrays;

public class Exam12 {

	public static void main(String[] args) {
	
		Season nowSeason = Season.WINTER;
		if(nowSeason  == Season.SUMMER) {
			System.out.println("맞습니당");
		}else {
			System.out.println("아닙니당");
		}
		
		
		Loginresult loginResult = Loginresult.FAILURE_ID;
		if(loginResult == Loginresult.SUCCESS) {
			System.out.println("로그인 성공");
		}else if(loginResult == Loginresult.FAILURE_ID) {

			System.out.println("ID를 다시 입력하세요");
		}else {
			System.out.println("패스워드가 틀립니다.");
		}
		
	}

}
