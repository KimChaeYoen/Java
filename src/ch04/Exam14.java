package ch04;

import java.util.Scanner;

public class Exam14 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
	
		//키보드에서 입력된 값을 받기위해서 쓰는 거임. 자세한 설명은 나중에
		Scanner scanner = new Scanner(System.in);
		
		//딱 3번만 반복함
		for(int i = 0;i<3;i++) {
			//키보드에서 입력한 내용을 data변수에 저장
			//멈춤이 언제 끝나는가?? 사용자가 엔터키 누를때 
			System.out.print("입력 : ");
			String data = scanner.nextLine();
			//data 변수의 값을 출력 
			System.out.println("출력: " + data);
		}
	}
	
}
