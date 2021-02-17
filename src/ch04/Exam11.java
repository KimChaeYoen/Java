package ch04;

public class Exam11 {
//클래스의 이름은 파일이름이랑 같아야 한다.
	
	public static void main(String[] args) {
	
		int count = 0;
		
		while(true) {
			count++;
			System.out.println(count);
			if(count>10) {
				break; //이 반복을 벗어나버니이
				//return; //return의 의미를 메소드 자체를 종료해라. 강제 종료해버림
			}
		}
		System.out.println("프그래매 마무리 내용 실행");
	}
	
}
