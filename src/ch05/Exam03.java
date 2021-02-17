package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
	
		int[]  scores1 = {90, 85, 95};
		int[]  scores2 = {90, 85, 95};
		int[]  scores3 = scores1; //scores1의 주소가 복사되어 scores3에 들어감
		
		
		//여기서 ==의 의미는 같은 번지 안에 있습니까의 의미임 
		System.out.println(scores1 == scores2);//false
		System.out.println(scores1 == scores3);//true
	}

}
