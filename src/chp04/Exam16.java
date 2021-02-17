package chp04;

import java.util.Scanner;

public class Exam16 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자1:");
			//int num1 = Integer.parseInt(scanner.nextLine()); //문자열을  정수로 바꾸면 됨
			double num1 = Double.parseDouble(scanner.nextLine()); //문자열을  정수로 바꾸면 됨
			
			
			System.out.print("숫자2:");
			//int num2 = Integer.parseInt(scanner.nextLine());
			double num2 = Double.parseDouble(scanner.nextLine());

		   //int result = num1 + num2;
			   
			//System.out.println("결과: " + result);
		}
	}
}
