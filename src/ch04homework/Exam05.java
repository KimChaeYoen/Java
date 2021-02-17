package ch04homework;

public class Exam05 {

	public static void main(String[] args) {
	
		int score = (int)(Math.random()*20) + 81;
		System.out.println("Á¡¼ö:" + score);
		
		String grade;
		
		if(score>=90) {
			grade = "A+";
		}else {
			grade = "A";
		}
	}

}
