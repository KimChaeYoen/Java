package ch04;

import java.util.Scanner;

public class Exam15 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
	
		//키보드에서 입력된 값을 받기위해서 쓰는 거임. 자세한 설명은 나중에
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//키보드에서 입력한 내용을 data변수에 저장
			//멈춤이 언제 끝나는가?? 사용자가 엔터키 누를때 
			System.out.print("입력 : ");
			String data = scanner.nextLine();
			//data 변수의 값을 출력 
			System.out.println("출력: " + data);
		
			//멈춤조건
			//문자열을 비교할 때는 data = "점심시간" 이렇게 비교 안됨.
			//data.equals("") 라고 사용해야함 
			if(data.equals("점심시간")) {
				break;
			}
		}
	}
	
}
