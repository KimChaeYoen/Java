package ch04homework;

public class Exam01 {

	public static void main(String[] args) {
		//if문
		
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수는 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}
		
		if(score<90) 
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다"); //중괄호가 없기때문에 16라인까지만 영향을 미친다
	}

}
